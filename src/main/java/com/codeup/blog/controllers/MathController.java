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
	public int add(@PathVariable int num, @PathVariable int num2) {
		return num + num2;
	}

	@ResponseBody
	@GetMapping ("/subtract/{num2}/from/{num}")
	public int subtract(@PathVariable int num, @PathVariable int num2) {
		return num - num2;
	}

	@GetMapping ("/multiply/{num}/and/{num2}")
	public int multiply(@PathVariable int num, @PathVariable int num2) {
		return num * num2;
	}

	@GetMapping ("/divide/{num}/by/{num2}")
	public int divide(@PathVariable int num, @PathVariable int num2) {
		return num / num2;
	}
}
