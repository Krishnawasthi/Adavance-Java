package com.snapchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class signUpController {
	
	
	@PostMapping("signup")
	@ResponseBody
	public String doSignUp(
			@RequestParam("email") String email,
			@RequestParam("userName") String  userName ,
			@RequestParam("mobileNo") String mobileNo
			) {
		
		System.out.println("email : "+ email );
		System.out.println("userName :"+ userName);
		System.out.println("mobileNo : "+ mobileNo );
		
		return "You signed up successfully";
		
	}
}
