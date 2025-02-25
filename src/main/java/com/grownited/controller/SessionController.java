package com.grownited.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;

@Controller
public class SessionController {

	@Autowired // this will create object - singleton { allocate memory once }
	UserRepository userRepository;

	// signup
	@GetMapping("signup")
	public String signup() {
		return "Signup";
	}

	// login
	@GetMapping("login")
	public String login() {
		return "Login";
	}

	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity) {
		// read
		System.out.println(userEntity.getFirstName());
		userEntity.setActive(true);
		userEntity.setCreatedAt(new Date());
		// validation
		// db save
		userRepository.save(userEntity);// insert
		return "Login";
	}
	// forgetpassword

	// update password

}
