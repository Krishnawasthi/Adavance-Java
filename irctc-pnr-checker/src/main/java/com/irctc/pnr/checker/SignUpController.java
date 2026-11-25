package com.irctc.pnr.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {
	
	//post request 
		@PostMapping("signUp")
		
		public String doSignUp
		(
				@RequestParam ("firstName")String firstName,
				@RequestParam ("lastName")String lastName,
				@RequestParam ("email")String email,
				@RequestParam ("userId")String userId
				
				) {
			
			System.out.println(" firstName : " + firstName);
			System.out.println(" lastName :" + lastName);
			System.out.println(" email : " + email);
			System.out.println(" userId : " + userId);
			
			return "redirect:/pnrcheck.jsp";
			
		}

}
