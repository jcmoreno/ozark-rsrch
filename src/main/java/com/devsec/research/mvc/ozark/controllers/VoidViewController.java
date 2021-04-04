package com.devsec.research.mvc.ozark.controllers;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.devsec.research.mvc.ozark.bean.User;
import com.oracle.ozark.core.Models;

@Controller
@Path("void")
public class VoidViewController {

    @Inject
    Models models;

    @GET
    @View("void-hello.jsp")
    public void sayHello(@QueryParam("name") String name) {
    	User myUser = new User();
    	myUser.setName(name);
    	this.models.put("text", "Hello " + myUser.getName());
    	this.models.put("user", myUser);
    }

}