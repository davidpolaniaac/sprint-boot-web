package com.github.davidpolaniaac.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.davidpolaniaac.web.models.domain.Bill;

@Controller
@RequestMapping("/bill")
public class BillController {

	@Autowired
	private Bill bill;

	@GetMapping("show")
	public String bill(Model model) {
		model.addAttribute("bill", bill);
		model.addAttribute("title", "Bill");
		return "bill/show";
	}

}
