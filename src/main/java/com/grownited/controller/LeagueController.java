package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.LeagueEntity;
import com.grownited.repository.LeagueRepository;

@Controller
public class LeagueController {

	@Autowired
	LeagueRepository leagueRepository;
	
	@GetMapping("newleauge")
	public String newLeauge() {
		return "NewLeauge";
	}

	@PostMapping("saveleague")
	public String saveLeague(LeagueEntity leagueEntity) {
		leagueRepository.save(leagueEntity);
		return "NewLeauge";
	}
	
	@GetMapping("listleauge")
	public String listLeauge(Model model) {
		List<LeagueEntity> allLeague = leagueRepository.findAll();	
		model.addAttribute("allLeauge",allLeague);
		return "ListLeauge";
	}
}
