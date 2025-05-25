package com.iunera.jsonldjava.schemaorg.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Modifier;

import com.iunera.jsonldjava.schemaorg.generator.RDFClassToJavaClassExtraktor.Type;
import com.squareup.javapoet.associationspec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.sun.mail.handlers.multipart_mixed;
/**
 * This class is a mater for JSON LD documents to determine if the current node is a property of an rdf class
 * it tries to determine all the properties that I currently know of 
 * However, some still might be missing
 * 
 * */
public class RDFProperty {
	

	private boolean isproperty = false;

	public boolean isIsproperty() {
		return isproperty;
	}

	public boolean isIsdeprecated() {
		return isdeprecated;
	}

	public String getName() {
		return name;
	}

	public RDFProperty(Map<String, Object> entity) {
		this.entity = entity;
		if (entity.containsKey("http://schema.org/supersededBy"))
			isdeprecated = true;
		if (entity.get("@type").toString().toLowerCase().equals("rdf:property")
				|| entity.get("@type").toString().toLowerCase()
						.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")) {
			isproperty = true;
			return;
		}

		String entityName = entity.get("@id").toString().toString().replace("http://schema.org/", "");
		if (Character.isLowerCase(entityName.charAt(0))) {
			isproperty = true;
			name = entityName;
		} else {
			isproperty = false;

		}
	}

	public boolean isDeprecated() {
		return isdeprecated;
	}

	public Set<String> getEntities() {
		Object domainIncludes = entity.get("http://schema.org/domainIncludes");
		Set<String> ret = new HashSet<>();

		if (domainIncludes == null)
			return ret;
		if (domainIncludes instanceof List) {
			for (Object type : ((List) domainIncludes)) {
				ret.add(((Map<String, String>) type).get("@id").replace("http://schema.org/", ""));
			}
		} else {
			ret.add(((Map<String, String>) domainIncludes).get("@id").replace("http://schema.org/", ""));
		}

		return ret;

	}
	public boolean hasInverse(){
		return entity.containsKey("http://schema.org/inverseOf");
	}
	
	public String getInverse(){
		return entity.get("http://schema.org/inverseOf").toString().toString().replace("@id=http://schema.org/", "").replace("}", "").replace("{", "");
	}


	// "@type": "rdf:Property",
	public Set<FieldSpec> getFields() {
		Set<FieldSpec> ret = new HashSet<>();
		String comment=entity.get("http://www.w3.org/2000/01/rdf-schema#comment").toString();
		if(comment==null)comment="";
		comment=comment.replace("$","");
		boolean isMultiField = entity.get("http://schema.org/rangeIncludes").toString().contains("[");

		String field = entity.get("http://schema.org/rangeIncludes").toString().replace("http://schema.org/", "")
				.replace("}", "").replace("{", "").replace("[", "").replace("]", "").replace("@id=", "");
		if (field.equals("http://www.w3.org/2000/01/rdf-schema#Class"))
			field = "Object";
		String[] types = field.split(",");
		associationspec associationspec=associationspec.builder(ClassName.get(SchemaClassGenerator.ANNOTATIONPACKAGE, "JsonldProperty")).addMember("value","\""+ entity.get("@id").toString()+"\"").build();//associationspec
		
		if (types.length < 2) {

			String type = types[0].trim();
			if (isMultiField) {
				TypeName typename = null;
				ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, transformType(type));
				typename = ParameterizedTypeName.get(ClassName.get(Set.class), clazz);
				
				ret.add(FieldSpec.builder(typename, name.trim(), Modifier.PUBLIC).addAnnotation(associationspec).addJavadoc(comment ).build());
			} else {
				ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, transformType(type));
				ret.add(FieldSpec.builder(clazz, name.trim(), Modifier.PUBLIC).addAnnotation(associationspec).addJavadoc(comment).build());
			}

		} else {

			for (String type : types) {
				type = type.trim();
				if (isMultiField) {
					TypeName typename = null;
					ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, transformType(type));
					typename = ParameterizedTypeName.get(ClassName.get(List.class), clazz);
					ret.add(FieldSpec.builder(typename, name.trim()+
							""+Character.toUpperCase(type.trim().charAt(0))+ type.trim().substring(1), Modifier.PUBLIC)
							.addAnnotation(associationspec).addJavadoc(comment )
							.build());
				} else {
					ClassName clazz = ClassName.get(SchemaClassGenerator.TYPEPACKAGE, transformType(type));
					ret.add(FieldSpec.builder(clazz, name.trim()+""+Character.toUpperCase(type.trim().charAt(0))+ type.trim().substring(1), Modifier.PUBLIC).addAnnotation(associationspec).addJavadoc(comment ).build());
				}
			}
		}

		return ret;
	}
	public String transformType(String type){
	if (type.equals("Boolean"))
		type = "Boolean";
	if (type.equals("Text"))
		type = "String";
	if (type.equals("Date"))
		type = "java.util.Date";
	if (type.equals("URL"))
		type = "java.net.URL";
	if (type.equals("DateTime"))
		type = "java.util.Date";
	if (type.equals("Number"))
		type = "java.math.BigDecimal";
	if (type.equals("Time"))
		type = "String";
	if (type.equals("Integer"))
		type = "Integer";
	if (type.equals("Float"))
		type = "Float";
	return type;
	}
	private boolean isdeprecated = false;
	private Map<String, Object> entity;
	private String name;
	private  String javadoc;
	private  List<String> Type;
	private  boolean isArray;
	// indicates if a reversive entity exists - owns -> ownedby
	private  boolean isReversible;
	private  boolean hasDifferentTargetTypes;
}
