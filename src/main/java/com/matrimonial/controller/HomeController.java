package com.matrimonial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.matrimonial.model.TestDBPO;
import com.matrimonial.service.UserDetailService;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/login")
public class HomeController 
{

	@Autowired
	UserDetailService userServ;
	
	@RequestMapping("/start")
	public List<TestDBPO> landingPage(  Model model)
	{
		System.out.println("Hitting-->");
		List<TestDBPO> userList = userServ.FindAll();
		for(TestDBPO date: userList) {
			System.out.println(date.getCompany());
		}
		
		return userList;
	}
	@PostMapping("/insert")
	public List<TestDBPO> insertData(@RequestParam String city,@RequestParam String company,@RequestParam String role,   Model model)
	{
		System.out.println("Hitting-->");
		 TestDBPO table = new TestDBPO();
		 table.setCity(city);
		 table.setCompany(company);
		 table.setRole(role);
		 
		 userServ.insertDate(table);
		return userServ.FindAll();
	}
	
	
}
