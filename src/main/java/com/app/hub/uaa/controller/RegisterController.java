package com.app.hub.uaa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.hub.uaa.model.User;
import com.app.hub.uaa.service.AuthenticationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/register")
@CrossOrigin("*")
@AllArgsConstructor
public class RegisterController {
	
	private final AuthenticationService authenticationService;
	
	@PostMapping()
	public String register(@RequestBody User user) {
		authenticationService.registerUser(user.getEmail(), user.getUsername(), user.getPassword());
		return "user registered!";
	}

}
