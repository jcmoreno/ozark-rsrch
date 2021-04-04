package com.devsec.research.mvc.ozark.controllers;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.devsec.research.mvc.ozark.bean.User;
import com.oracle.ozark.core.Models;

@Controller
@Path("velocity")
public class VelocityViewController {

    @Inject
    Models models;

    @GET
    public String sayHello(@QueryParam("name") String name) {
    	User myUser = new User();
    	myUser.setName(name);
    	this.models.put("text", myUser.getName());
    	this.models.put("user", myUser);
    	
    	return "velocity-hello.vm";
    }
    
    /*@POST
    public String sayHello2(@QueryParam("name") String name) {
    	User myUser = new User();
    	myUser.setName(name);
    	this.models.put("text", myUser.getName());
    	this.models.put("user", myUser);
    	
    	return "velocity-hello.vm";
    }*/

}