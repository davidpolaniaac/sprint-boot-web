package com.github.davidpolaniaac.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {
	
	@GetMapping("/")
	public String send(Model model) {
		model.addAttribute("title", "Send params");
		return "params/index";
	}

	@GetMapping("/show")
	public String param(@RequestParam(name = "text", required = false, defaultValue = "Without value") String text,
			Model model) {
		model.addAttribute("title", "Show params");
		model.addAttribute("result", text);
		return "params/show";
	}

}
