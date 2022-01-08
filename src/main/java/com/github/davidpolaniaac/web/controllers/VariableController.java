package com.github.davidpolaniaac.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variable")
public class VariableController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Send path variable");
		return "variable/index";
	}
	
	@GetMapping("/show/{text}")
	public String show(@PathVariable String text, Model model) {
		model.addAttribute("title", "Send path variable");
		model.addAttribute("text", text);
		return "variable/show";
	}
	
	@GetMapping("/show/{text}/{num}")
	public String show(@PathVariable String text, @PathVariable Integer num, Model model) {
		model.addAttribute("title", "Send path variable");
		model.addAttribute("text", text + " " + num);
		return "variable/show";
	}
	
}
