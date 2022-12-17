package com.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.challenge.services.AuthenticationService;

@Controller
@SessionAttributes("username")
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	@Autowired
	public LoginController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@GetMapping("login")
	public String gotoLogin() {
		return "login";
	}
	
	@PostMapping("login")
	public String postLogin(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
		if (!authenticationService.authenticate(name, password)) {
			model.addAttribute("error", "Not Authorized");
			return "login";
		}
		model.addAttribute("username", name);
		return "welcome";
	}
}
