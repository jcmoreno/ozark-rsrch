package com.devsec.research.mvc.ozark.bean;

import javax.ws.rs.QueryParam;

import com.devsec.research.mvc.ozark.validators.Prefix;

public class MrUser extends User {
	
	@Prefix()
	@QueryParam("prefix")
	private String prefix;

	public MrUser() {
		super();
	}

	public MrUser(String name) {
		super(name);
	}

	public String getPrefix() {
		return prefix;
	}

	public String setPrefix(String prefix) {
		this.prefix = prefix;
		return prefix;
	}

}
