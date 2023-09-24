package com.curd.mongo.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Document
@NoArgsConstructor
@AllArgsConstructor
public class server {
	@Id
	private Long id;
	private String name;
	private String language;
	private String framework;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public String getserverid() {
		// TODO Auto-generated method stub
		return null;
	}


}
