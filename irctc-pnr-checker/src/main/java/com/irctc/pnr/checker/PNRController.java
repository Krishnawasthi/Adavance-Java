package com.irctc.pnr.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PNRController {
	
	@GetMapping("/checkPNR") // action name
	@ResponseBody
	public String checkPNR() {

	    System.out.println("PNRController.checkPNR()..........................");

	    return "PNR Status: CONFIRMED | PNR Number: 1234567890 | Passenger Status: CNF";
	}
	
	@GetMapping("/validateChaptcha") //action name
	@ResponseBody
	public String captcha() {
		
		System.out.println("PNRController.checkPNR()..........................");
		return "captcha validation is done";
	}
}
