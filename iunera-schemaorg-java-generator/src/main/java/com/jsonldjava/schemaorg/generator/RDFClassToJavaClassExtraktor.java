package com.iunera.jsonldjava.schemaorg.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.squareup.javapoet.ClassName;
/**
 * Thus class is kind of an ugly dirty util to push a JSON LD node into it and in case it is a schama.org entity, the values of
 * the entity can be extracted via the properties directly or by using the corresponding methods
 * In case the node is not a class, isMainEntity() will return false
 * */
public class RDFClassToJavaClassExtraktor {
	public static class Type {
		public Type(String type, String name, String javadoc) {
			this.name = name;
			this.type = type;
			this.javadoc = javadoc;
		}

		public String type;
		public String name;
		public String javadoc;
	}

	private Map<String, Object> entity;
	private boolean ismainentity = false;
	public boolean isIsmainentity() {
		return ismainentity;
	}

	public String getEntityName() {
		return entityName;
	}

	public boolean isIsdeprecated() {
		return isdeprecated;
	}

	private String entityName;
	private boolean isdeprecated=false;
	


	public RDFClassToJavaClassExtraktor(Map<String, Object> entity) {
		this.entity = entity;

		for (Map.Entry<String, Object> entityproperties : entity.entrySet()) {
			if (entityproperties.getKey().equals("@id")) {
				entityName = entityproperties.getValue().toString().replace("http://schema.org/", "");
				if (Character.isLowerCase(entityName.charAt(0))) {
					entityName = entityproperties.getValue().toString().replace("http://schema.org/", "");
					break;
				} else {
					ismainentity = true;
					break;
				}

			}

		}
		if(entity.containsKey("http://schema.org/supersededBy")) isdeprecated=true;
		/*if(entityproperties.getKey().toString().equals("http://www.w3.org/2000/01/rdf-schema#comment")){
			continue;
			entityproperties.getKey().equals("http://schema.org/domainIncludes")
		}*/
	}
	
	public String getID(){
		return this.entity.get("@id").toString();
	}
	

	public boolean isBasicEnity(){
		String idvalue=entity.get("@id").toString();
		String typevalue=entity.get("@type").toString();
		if(idvalue.contains("http://schema.org/Boolean")
				||idvalue.contains("http://schema.org/Date")
				||idvalue.contains("http://schema.org/DateTime")
				||idvalue.contains("http://schema.org/Number")
				||idvalue.contains("http://schema.org/Text")
				||idvalue.contains("http://schema.org/Float")
					||idvalue.contains("http://schema.org/URL")
				||idvalue.contains("http://schema.org/Time")
				||idvalue.contains("http://schema.org/Integer")||
				
				typevalue.contains("http://schema.org/Boolean")
				||typevalue.contains("http://schema.org/Date")
				||typevalue.contains("http://schema.org/Float")
				||typevalue.contains("http://schema.org/Integer")
				||typevalue.contains("http://schema.org/DateTime")
				||typevalue.contains("http://schema.org/Number")
				||typevalue.contains("http://schema.org/Text")
					||typevalue.contains("http://schema.org/URL")
				||typevalue.contains("http://schema.org/Time")
				) return true;
		return false;
	}
	public String getJavaDoc(){
			String comment=entity.get("http://www.w3.org/2000/01/rdf-schema#comment").toString();
		if(comment==null)comment="";
		comment=comment.replace("$","");
		return comment;
	}
	public boolean isDeprecated(){
		return isdeprecated;
	}

	public boolean isMainEntity() {
		return ismainentity;
	}

	public String getName() {
		return entityName;

	}

	public List<Type> getSuperTypes() {
		List<Type> ret = new ArrayList<>();
		Object supertypesstring = entity.get("http://www.w3.org/2000/01/rdf-schema#subClassOf");
		String typestring=entity.get("@type").toString().replace("http://schema.org/", "");
		if (supertypesstring == null && typestring.contains("rdfs:Class"))
			return ret;
		{
			try {
				List<String> supertypes=new ArrayList<>();
				if(this.getName().contains("nline")){
					System.out.print("");
				}
				supertypes.add(typestring);
				if(supertypesstring!=null)
				for(String type:
				 supertypesstring.toString().replace("@id=http://schema.org/", "")
						.replace("}", "").replace("{", "").replace("[", "").replace("]", "")

						.split(","))supertypes.add(type);
				
				for (String supertype : supertypes) {
					supertype = supertype.trim();
					if(supertype.equalsIgnoreCase("@id=http://www.w3.org/2000/01/rdf-schema#Class")
							||supertype.equalsIgnoreCase("@id=http://www.w3.org/2000/01/rdf-schema#class")
							||supertype.contains("http://www.w3.org/2000/01/rdf-schema#Class")
							||supertype.contains("http://www.w3.org/2000/01/rdf-schema#class")
							||supertype.contains("rdfs:Class")
							)continue ;// we do not add rdf class as supertype
						
					ret.add(new Type(supertype, "", ""));
				
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		return ret;
	}

}
