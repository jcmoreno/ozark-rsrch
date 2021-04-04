package com.devsec.research.mvc.ozark.bean;

import javax.ws.rs.QueryParam;

/**
 * @author Juan Moreno
 *
 */
public class User {

	@QueryParam("name")
	private String name;

	public User() {
		this.name= "";
	}
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
