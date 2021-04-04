package com.devsec.research.mvc.ozark.controllers;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.devsec.research.mvc.ozark.bean.MrUser;
import com.oracle.ozark.core.Models;

@Controller
@Path("validatebean")
public class BeanValidationController {

	@Inject
	Models models;
	
	@GET
	@View("bean-hello.jsp")
    public Response sayHello(@Valid @BeanParam MrUser mrUser) {
    	
    	MrUser myUser;
    	
    	//if (!result.isFailed()) {
    		myUser = mrUser;
    		this.models.put("user", myUser);
    		return Response.status(Response.Status.OK)
            		.entity("bean-hello.jsp")
            		.build();
    	/*}
    	else {
    		String errorMessage = "";
    		
    		List<ParamError> errors = (List<ParamError>) result.getAllErrors();

		   for( ParamError  e :  errors) {
			   errorMessage += "ERROR: "  +  e.getMessage();
		   }
		   
		   this.models.put("message", errorMessage);
		   return Response.status(Response.Status.BAD_REQUEST)
	        		.entity("bean-hello.jsp")
	        		.build();
    	}*/
       
    }

}