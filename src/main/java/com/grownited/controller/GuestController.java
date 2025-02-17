package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController {

	@GetMapping(value = { "home", "/" })
	public String home() {
		return "GuestHome";
	}
}
