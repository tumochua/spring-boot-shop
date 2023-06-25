package com.project.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/home")
public class Welcome {
	@GetMapping("")
	public String Welcome(Model model) {
		model.addAttribute("message","Hello word tumochua abc sadsa");
		return "home/home";
	}
}
