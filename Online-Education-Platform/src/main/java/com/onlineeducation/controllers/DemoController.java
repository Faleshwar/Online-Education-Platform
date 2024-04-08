package com.onlineeducation.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

	@GetMapping("/")
	public String test() {
		return "Online Education System";
	}
	
}
