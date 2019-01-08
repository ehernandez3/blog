package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceRollController {

	@GetMapping ("/roll-dice")
	public String rollDice() {
		return "roll-dice";
	}

	@GetMapping ("/roll-dice/{n}")
	public String rollDice(@PathVariable int n, Model model) {
		int roll = (int) (Math.random() * 5) + 1;

		model.addAttribute("roll", roll);
		model.addAttribute("guess", n);
		return "roll-results";

	}

}
