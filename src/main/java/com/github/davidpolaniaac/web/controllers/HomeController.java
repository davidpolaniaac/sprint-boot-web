package com.github.davidpolaniaac.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "" })
	public String index(Model model) {

		return "redirect:/app/index";
	}

	@GetMapping({ "/google" })
	public String google(Model model) {

		return "redirect:https://www.google.com/";
	}

	@GetMapping({ "/forward" })
	public String forward(Model model) {

		return "forward:/app/index";
	}

}
