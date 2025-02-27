package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.StateEntity;
import com.grownited.repository.StateRepository;

@Controller
public class StateController {

	@Autowired
	StateRepository stateRepository;

	@GetMapping("newstate")
	public String newState() {
		return "NewState";
	}

	@PostMapping("savestate")
	public String saveState(StateEntity stateEntity) {
		System.out.println(stateEntity.getStateName());
		stateRepository.save(stateEntity);
		return "NewState";
	}

	@GetMapping("liststate")
	public String listState(Model model) {

		List<StateEntity> allState = stateRepository.findAll();// select * from states ;
		model.addAttribute("states",allState);//send to jsp 
		return "ListState";
	}
	
	@GetMapping("deletestate")
	public String deleteState(Integer stateId) {
		stateRepository.deleteById(stateId);
		return "redirect:/liststate";//do not open jsp , redirect to list{url}
	}

}
