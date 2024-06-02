package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookLinkController {
	@GetMapping("/all")
	public String viewAll() {
		return "view_all";
	}
	@GetMapping("/pencil")
	public String pencil() {
		return "pencil";
	}
	@GetMapping("/crayon")
	public String crayon() {
		return "crayon";
	}
}
