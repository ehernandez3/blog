package com.codeup.blog.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
	private List<Post> posts;

	// Service Constructor
	public PostService() {
		posts = new ArrayList<>();
		createPosts();
	}

	// Returns a list of all the posts
	public List<Post> allPosts() {

		return posts;
	}

	// Creates an individual post and adds it to the list
	public Post createOnePost(Post post) {
		post.setId(posts.size() + 1);
		posts.add(post);
		return post;
	}

	// Returns an individual post based on the id
	public Post onePost(int id) {
		return posts.get(id - 1);
	}

	// Here we create multiple posts and add them to the list
	private void createPosts() {
		Post post1 = new Post("Post Title 1", "Post Body1");
		Post post2 = new Post("Post Title 2", "Post Body2");
		Post post3 = new Post("Post Title 3", "Post Body3");
		Post post4 = new Post("Post Title 4", "Post Body4");
		Post post5 = new Post("Post Title 5", "Post Body5");

		createOnePost(post1);
		createOnePost(post2);
		createOnePost(post3);
		createOnePost(post4);
		createOnePost(post5);
	}

	public void save(Post post) {
		createOnePost(post);

	}


 }
//Create a PostService class and inject it into your posts controller. The service should
// keep an array list of posts internally, and have methods for:
//
//		- finding a post (retrieving an individual post object)
//		- retrieving all the posts
