package com.github.davidpolaniaac.web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.davidpolaniaac.web.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${project.message}")
	private String message;

	@GetMapping({ "/index", "/", "" })
	public String index(Model model) {
		model.addAttribute("title", message);
		return "index";
	}

	@GetMapping("/profile")
	public String profile(Model model) {
		User user = new User();
		user.setName("Davie");
		user.setLastName("Smith");
		user.setEmail("david@domain.com");
		model.addAttribute("user", user);
		model.addAttribute("title", "Profile");
		return "profile";
	}

	@GetMapping("/list")
	public String list(Model model) {
		User user1 = new User("davie", "smith", "davie@domain.com");
		User user2 = new User("davie", "klein", "davie@domain.com");
		User user3 = new User("davie", "walker", "davie@domain.com");

		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		model.addAttribute("title", "User list");
		model.addAttribute("users", users);

		return "list";
	}

	@ModelAttribute("options")
	public List<String> options() {
		List<String> options = Arrays.asList("A", "B", "C");
		return options;
	}
}
