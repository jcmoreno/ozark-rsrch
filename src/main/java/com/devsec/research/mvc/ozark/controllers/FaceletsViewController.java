package com.devsec.research.mvc.ozark.controllers;

import com.devsec.research.mvc.ozark.bean.User;
import com.devsec.research.mvc.ozark.utils.FacesUtil;
import com.oracle.ozark.core.Models;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

@Controller
@Path("facelets")
public class FaceletsViewController {

    @Inject
    Models models;

    @GET
    public String sayHello(@QueryParam("name") String name, @Context HttpServletRequest req, @Context HttpServletResponse resp) {
    	User myUser = new User();
    	myUser.setName(name);
    	this.models.put("text", "Hello " + myUser.getName());
    	this.models.put("user", myUser);
    	
    	FacesContext context = FacesUtil.getFacesContext(req, resp); //FacesContext.getCurrentInstance();
    	ExpressionFactory expressionFactory = context.getApplication().getExpressionFactory();
    	ELContext elContext = context.getELContext();
    	ValueExpression vex = expressionFactory.createValueExpression(elContext, name, String.class);
    	String result = (String) vex.getValue(elContext);
    	System.out.println("Result: " + result);
    	this.models.put("result", result);
    	
        return "hello.xhtml";
    }

}