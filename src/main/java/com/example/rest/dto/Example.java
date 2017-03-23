package com.example.rest.dto;

import java.io.Serializable;

public class Example implements Serializable {

	private static final long serialVersionUID = 8486388020827508333L;
	
	private Long id;
	private String name;
	private String description;
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Example(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
