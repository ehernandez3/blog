package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
	public String showPost(@PathVariable int id, Model model) {
		model.addAttribute("post", postService.findOnePost(id));
		model.addAttribute("id", id);

		// path and file name
		return "posts/show";
	}

	@GetMapping ("/posts/create")
	public String showCreateForm(Model model) {
		model.addAttribute("post", new Post());
		return "posts/create";
	}

	@PostMapping ("/posts/create")
	public String saveNewPost(@ModelAttribute Post post) {
		postService.save(post);

		return "redirect:/posts";
	}

	@GetMapping ("/posts/{id}/edit")
	public String showEditForm(@PathVariable int id, Model model) {
		model.addAttribute("post", postService.findOnePost(id));
		return "posts/edit";
	}

	@PostMapping ("/posts/{id}/edit")
	public String editPost(@ModelAttribute Post post) {
		postService.edit(post);
		return "posts/" + post.getId();
	}


}
