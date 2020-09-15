package com.yroots.ems.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@Value("${app.name}")
	private String appName;

	@GetMapping
	public String getWelcome() {
		return "Welcome to " + appName;
	}

}
