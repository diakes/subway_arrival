package com.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomController {
	@RequestMapping("/welcome") 
	public String welcome() 
	{ 
		return "welcome"; 
	}

}
