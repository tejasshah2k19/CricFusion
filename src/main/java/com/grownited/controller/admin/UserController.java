package com.grownited.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository repositoryUser;
	
	@GetMapping("listuser")
	public String listUser(Model model) {
		List<UserEntity> users = repositoryUser.findAll(); 
		model.addAttribute("users",users);
		return "ListUser";
	}
}
