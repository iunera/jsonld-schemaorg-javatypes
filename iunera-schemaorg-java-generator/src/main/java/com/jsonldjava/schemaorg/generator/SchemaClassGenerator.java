package com.iunera.jsonldjava.schemaorg.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Modifier;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SetMultimap;
import com.squareup.javapoet.associationspec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
/**
 * Generation rules in case of multi-inheritance
 * In case of multi-inheritance:
 * In case a class might have multiple superclasses, what is not possible in java, the second superclass is always realized as aggregation
 * 
 * */
public class SchemaClassGenerator {

	public static String TYPEPACKAGE="com.iunera.jsonldjava.schemaorg.metadatatypes";
	public static String ANNOTATIONPACKAGE="com.iunera.jsonldjava.schemaorg.associations";
	public static void main(String[] args) throws JsonLdError, IOException {
		
		// reading the json ld file - get a new version here:		
		// https://schema.org/docs/developers.html#defs
		File file = new File("src/main/resources/schema.jsonld");
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		InputStream inputStream = fis;// new
										// URL("https://schema.org/version/latest/schema.jsonld").openStream();
		// Read the file into an Object (The type of this object will be a List,
		// Map, String, Boolean,
		// Number or null depending on the root object in the file).
		Object jsonObject = JsonUtils.fromInputStream(inputStream);
		// Create a context JSON map containing prefixes and definitions
		Map context = new HashMap();
		// Customise context...
		// Create an instance of JsonLdOptions with the standard JSON-LD options
		
		// create the json ld graph from the file content
		JsonLdOptions options = new JsonLdOptions();
		List<Map<String, Object>> compact = (List<Map<String, Object>>) JsonLdProcessor.compact(jsonObject, context,
				options).get("@graph");
		
		// loop through all entities in the file and determine the properties of the classes
		// entity - properties - hashmap to store which class will have which properties for later code generation usage
		Multimap<String, FieldSpec> properties= com.google.common.collect.HashMultimap.create();
		Set<String> inverses= new HashSet<>();
		for (Map<String, Object> entity : compact) {
		
				RDFProperty property= new RDFProperty(entity);
				if(!property.isDeprecated()&& property.isIsproperty()
						&& !inverses.contains(property.getName())
						){
					if(property.hasInverse())
						inverses.add(
								property.getInverse());
					
					Set<String> pentities=property.getEntities();
					if(pentities!=null)
					for(String pentity: pentities){
						if(properties.containsKey(entity)){
							properties.get(pentity).addAll(property.getFields());
						}else{
							// it does not exist, yet
							properties.putAll(pentity, new HashSet<FieldSpec>(property.getFields()));
						}
					}
				}
				RDFClassToJavaClassExtraktor entityex = new RDFClassToJavaClassExtraktor(entity);
				if (!entityex.isMainEntity() || entityex.isDeprecated() || entityex.isBasicEnity()) {
					// stop the loop for non entities
					continue;
				}
			
		}
		
		
		
		
		
		// now loop through all main entities and then check the prior generated hashmap wherin the propertiy class associated is saved
		for (Map<String, Object> entity : compact) {
			RDFClassToJavaClassExtraktor entityex = new RDFClassToJavaClassExtraktor(entity);
			if (!entityex.isMainEntity() || entityex.isDeprecated() || entityex.isBasicEnity()) {
				// stop the loop for non entities
				continue;
			}
		

			
			// generate the main class together with the properties
			 associationspec associationspecVertex=
					 associationspec.builder(ClassName.get(SchemaClassGenerator.ANNOTATIONPACKAGE, "Vertex")).build();
			 associationspec associationspecjsonldtype= associationspec.builder(ClassName.get(SchemaClassGenerator.ANNOTATIONPACKAGE, "JsonldType"))	.addMember("value","\""+ entityex.getID()+"\"").build();
			com.squareup.javapoet.TypeSpec.Builder javabuilder = null;
			List<RDFClassToJavaClassExtraktor.Type> types=entityex.getSuperTypes();
			if(types.size()==0){
				// no superclass
				javabuilder = TypeSpec.classBuilder(entityex.getEntityName()).addModifiers(Modifier.PUBLIC)
						.addAnnotation(associationspecVertex).addAnnotation(associationspecjsonldtype).addJavadoc(entityex.getJavaDoc());
			}else 
			if (types.size() == 1) {
				// one superclass	
				ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, entityex.getSuperTypes().get(0).type);
				javabuilder = TypeSpec.classBuilder(entityex.getEntityName()).addModifiers(Modifier.PUBLIC)
						.superclass(clazz).addAnnotation(associationspecVertex).addAnnotation(associationspecjsonldtype).addJavadoc(entityex.getJavaDoc());

			} else {
				// more than one superclass
				ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, entityex.getSuperTypes().get(0).type);
				javabuilder = TypeSpec.classBuilder(entityex.getEntityName()).addModifiers(Modifier.PUBLIC)
						.superclass(clazz).addAnnotation(associationspecVertex).addAnnotation(associationspecjsonldtype).addJavadoc(entityex.getJavaDoc());
				// additional supertypes
				for (int i=1; i<types.size();i++) {
					// add a property for the second and more supertypes
					 TypeName tn=ClassName.get(SchemaClassGenerator.TYPEPACKAGE, types.get(i).type);
					 
					 associationspec associationspec=
							 associationspec.builder(ClassName.get(SchemaClassGenerator.ANNOTATIONPACKAGE, "JsonldProperty")).
							 addMember("value","\""+ "http://schema.org/"+types.get(i).type+"\"")
							 	
							 .build();
					FieldSpec field = FieldSpec.builder(tn, Character.toLowerCase(types.get(i).type.charAt(0))+
							types.get(i).type.substring(1), Modifier.PUBLIC).addAnnotation(associationspec)
							.addJavadoc("This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used.")
							.build();
					javabuilder.addField(field);
				}
			}

			
			
			// add the properties to the class
			try{
				if(properties.containsKey(entityex.getEntityName()))
			for (FieldSpec field : properties.get(entityex.getEntityName())) {

				javabuilder.addField(field);
			}
			}catch(Exception e){
				e.printStackTrace();
			}

			
			
			// write the type to the file system
			TypeSpec currentClass = javabuilder.build();
			JavaFile javaFile = JavaFile.builder(SchemaClassGenerator.TYPEPACKAGE, currentClass).build();
			javaFile.writeTo(new File("src/main/java/"));

		}

	}

}
