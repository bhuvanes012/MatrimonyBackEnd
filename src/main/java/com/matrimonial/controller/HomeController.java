package com.matrimonial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServlet;

@RestController
public class HomeController 
{

	
	@RequestMapping("/")
	public ModelAndView landingPage(Model model)
	{
		System.out.println("Hitting-->");
		return new ModelAndView("Home");
	}
	
	
}
