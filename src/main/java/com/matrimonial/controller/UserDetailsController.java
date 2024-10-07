package com.matrimonial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonial.model.ApiResponse;
import com.matrimonial.model.UserProfilePO;
import com.matrimonial.service.UserDetailService;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/user")
public class UserDetailsController {
	@Autowired
	 
	UserDetailService userService;
	@PostMapping("/register")
	public ApiResponse registerUser(@RequestBody UserProfilePO details,  Model model) {
		ApiResponse res = new ApiResponse();
        System.out.println(details);
		userService.registerUserProfile(details,res);
		return res;
	}

}
