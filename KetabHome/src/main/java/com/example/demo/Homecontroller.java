package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class Homecontroller {
	
	
	@GetMapping("/view")
	public String viewPage() {
		return "viewDashboard";
	}
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	
	@GetMapping("/403")
	public String error403() {
		return "403";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}