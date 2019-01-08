package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
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

	// Edit your PostController class to return the views you created above.
	//
	//Inside the method that shows an individual post, create a new post object
	// and pass it to the view.

	//Inside the method that shows all the posts, create a new array list and add
	// two post objects to it, then pass that list to the view.

	//In these two pages, you should display information based on the data passed
	// from the controller.

	@GetMapping ("/posts") // URL (e.g. http://localhost:8080/posts)
	public String index(Model model) {
		List<Post> posts = new ArrayList<>();
		Post post = new Post("Title 1", "body 1");
		Post post2 = new Post("Title 2", "body 2");

		posts.add(post);
		posts.add(post2);

		model.addAttribute("posts", posts);

		// path and file name
		return "posts/index";
	}

	@GetMapping ("/posts/{id}") // URL (e.g. http://localhost:8080/posts/2)
	public String show(@PathVariable long id, Model model) {
		Post post = new Post("Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
				"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		model.addAttribute("post", post);

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
