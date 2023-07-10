package com.nephew.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nephew.microservices.limitsservice.bean.Limits;
import com.nephew.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping(path = "/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getProfile(), configuration.getMinimum(), configuration.getMaximum());
	}
	
}
