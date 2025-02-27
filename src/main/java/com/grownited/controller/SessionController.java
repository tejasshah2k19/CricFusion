package com.grownited.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {

	@Autowired // this will create object - singleton { allocate memory once }
	UserRepository repositoryUser;

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
		repositoryUser.save(userEntity);// insert
		return "Login";
	}
	// forgetpassword

	// update password

	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}

	@PostMapping("authenticate")
	public String authenticate(String email, String password, Model model, HttpSession session) {// sakira@yopmail.com
																									// sakira
		System.out.println(email);
		System.out.println(password);

		// users -> email,password
		Optional<UserEntity> op = repositoryUser.findByEmail(email);
		// select * from users where email = :email and password = :password
		if (op.isPresent()) {
			// true
			// email
			UserEntity dbUser = op.get();
			session.setAttribute("user", dbUser);
			// boolean ans = encoder.matches(password, dbUser.getPassword());
//
//			if (ans == true) {
//				session.setAttribute("user", dbUser); // session -> user set
//				if (dbUser.getRole().equals("ADMIN")) {
//
//					return "redirect:/admindashboard";
//				} else if (dbUser.getRole().equals("USER")) {
//
//					return "redirect:/home";
//				} else {
//					model.addAttribute("error", "Please contact Admin with Error Code #0991");
//					return "Login";
//				}
//
//			}
			
			return "redirect:/admindashboard";
		}
		model.addAttribute("error", "Invalid Credentials");
		return "Login";
	}

}
