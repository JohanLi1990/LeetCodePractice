package com.challenge.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		return username.equals("cy1") && password.equals("nothing");
	}

}
