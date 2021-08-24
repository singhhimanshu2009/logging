package com.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String home() {

		logger.trace("*****This is loging treace message*****");

		return "Welcome Logging";
	}

}