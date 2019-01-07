package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@ResponseBody
	@GetMapping ("/add/{num}/and/{num2}")
	public double add(@PathVariable double num, @PathVariable double num2) {
		return num + num2;
	}

	@ResponseBody
	@GetMapping ("/subtract/{num}/from/{num2}")
	public double subtract(@PathVariable double num, @PathVariable double num2) {
		return num2 - num;
	}

	@GetMapping ("/multiply/{num}/and/{num2}")
	public double multiply(@PathVariable double num, @PathVariable double num2) {
		return num * num2;
	}

	@GetMapping ("/divide/{numerator}/by/{denominator}")
	public double divide(@PathVariable double numerator, @PathVariable double denominator) {
		return numerator / denominator;
	}
}
