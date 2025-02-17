package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.UserEntity;

@Controller
public class SessionController {

	//signup
	@GetMapping("signup")
	public String signup() {
		return "Signup";
	}
	//login 
	@GetMapping("login")
	public String login() {
		return "Login";
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity) {
		//read 
		System.out.println(userEntity.getFirstName());
		//validation 
		//db save 
		return "Login";
	}
	//forgetpassword
	
	//update password 
	
}
