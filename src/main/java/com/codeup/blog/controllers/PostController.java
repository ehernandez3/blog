package com.codeup.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@GetMapping ("/posts")
	public String index() {
		return "Will display all posts";
	}

	@GetMapping ("/posts/{id}")
	public String show(@PathVariable long id) {
		return "Will show the post with the id of: " + id;
	}

	@GetMapping ("/posts/create")
	public String create() {
		return "Will display a form to create a post";
	}

	@PostMapping ("/posts/create")
	public String save() {
		return "Will display the created post";
	}
}
