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

	// Returns an individual post based on the id
	public Post findOnePost(int id) {
		return posts.get(id - 1);
	}

	// Assigns an id to a post and ads the post to the list
	public Post save(Post post) {
		post.setId(posts.size() + 1);
		posts.add(post);
		return post;
	}

	public Post edit (Post post) {
		Post pp = posts.get(post.getId()-1);
		pp.setTitle(post.getTitle());
		pp.setBody(post.getBody());
		return pp;
	}

	// Here we create multiple posts and add them to the list
	private void createPosts() {
		Post post1 = new Post("Post Title 1", "Post Body1");
		Post post2 = new Post("Post Title 2", "Post Body2");
		Post post3 = new Post("Post Title 3", "Post Body3");
		Post post4 = new Post("Post Title 4", "Post Body4");
		Post post5 = new Post("Post Title 5", "Post Body5");

		save(post1);
		save(post2);
		save(post3);
		save(post4);
		save(post5);
	}




 }
//Create a PostService class and inject it into your posts controller. The service should
// keep an array list of posts internally, and have methods for:
//
//		- finding a post (retrieving an individual post object)
//		- retrieving all the posts
