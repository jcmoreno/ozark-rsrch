package com.devsec.research.mvc.ozark.controllers;

import com.devsec.research.mvc.ozark.bean.User;
import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("scanned")
public class ScannedViewController {

    @Inject
    Models models;

    @GET
    public String sayHello(@QueryParam("name") String name) {
    	User myUser = new User();
    	myUser.setName(name);
    	this.models.put("text", "Hello " + myUser.getName());
    	this.models.put("user", myUser);
        return "scanned-hello.jsp";
    }

}