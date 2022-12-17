package com.challenge.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.challenge.model.User;
import com.challenge.repositories.UserRepository;

@Controller
public class UserController {
	
	private static final String REDIRECT_INDEX = "redirect:/index";
	private UserRepository userRepository;
	
	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/signup")
	public String showSignUpForm(User user) {
		return "add-user";
	}
	
	@PostMapping("/adduser")
	public String addUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		
		userRepository.save(user);
		return REDIRECT_INDEX;	
	}
	
	@GetMapping("/hellojsp")
	public String getJsp() {
		return "hello";
	}
	
	
	@GetMapping("/index")
	public String showUserList(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));
		
		model.addAttribute("user", user);
		return "update-user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid User user, 
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			user.setId(id);
			return "update-user";
		}
		userRepository.save(user);
		return REDIRECT_INDEX;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + id));
		userRepository.delete(user);
		return REDIRECT_INDEX;
	}
	
	
}
