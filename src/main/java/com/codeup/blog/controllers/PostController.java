package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

	private final PostService postService;

	public PostController (PostService postService) {
		this.postService = postService;
	}

	@GetMapping ("/posts") // URL (e.g. http://localhost:8080/posts)
	public String index(Model model) {

		model.addAttribute("posts", postService.allPosts());

		// path and file name
		return "posts/index";
	}

	@GetMapping ("/posts/{id}") // URL (e.g. http://localhost:8080/posts/2)
	public String show(@PathVariable int id, Model model) {

		model.addAttribute("post", postService.onePost(id));

		// path and file name
		return "posts/show";
	}

	@GetMapping ("/posts/create")
	public String create() {
		return "Will display a form to create a post";
	}

	@PostMapping ("/posts/create")
	public String save() {
		return "Will create the post";
	}
}
