package com.codeup.blog.models;

import com.codeup.blog.Repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
	private PostRepository postRepository;

	public PostService (PostRepository postRepository) {
		this.postRepository = postRepository;
	}


	// Returns a list of all the posts
	public List<Post> allPosts() {
		return (List<Post>) postRepository.findAll();
	}

	// Returns an individual post based on the id
	public Post findOnePost(long id) {
		return postRepository.findOne(id);

	}

	// Assigns an id to a post and ads the post to the list
	public long save(Post post) {
		postRepository.save(post);
		return post.getId();
	}

	// Deletes a post
	public void delete(Post post){
		postRepository.delete(post);
	}


 }
