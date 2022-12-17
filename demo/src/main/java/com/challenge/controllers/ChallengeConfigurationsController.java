package com.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.configurations.ChallengeConfiguration;

// if it is controller, what we are returning as string will be used to search for a view, say callengeConfiguration.html
@RestController
public class ChallengeConfigurationsController {
	
	@Autowired
	private ChallengeConfiguration challengeConfiguration;
	
	@GetMapping("/challenge_properties")
	public ChallengeConfiguration getChallengeProperties() {
		
		return challengeConfiguration;
	}
	
}
