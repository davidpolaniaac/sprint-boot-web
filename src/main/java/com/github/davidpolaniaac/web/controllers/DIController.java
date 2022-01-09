package com.github.davidpolaniaac.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.davidpolaniaac.web.services.IMyService;

@Controller
@RequestMapping("/di")
public class DIController {

	@Autowired
	@Qualifier("MySimpleService")
	private IMyService myService;
	
	@GetMapping({ "/index", "/", "" })
	public String index(Model model) {
		model.addAttribute("title", "DI");
		model.addAttribute("text", myService.operation());
		return "di/index";
	}
	
}
