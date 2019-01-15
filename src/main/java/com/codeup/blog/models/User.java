package com.codeup.blog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

	@Id @GeneratedValue
	private long id;

	@Column (unique = true, nullable = false, length = 100)
	private String username;

	@Column(unique = true, nullable = false, length = 100)
	private String email;

	@Column(nullable = false, length = 100)
	private String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Post> posts;

	public User() {}

	public User(User copy) {
		id = copy.id;
		email = copy.email;
		username = copy.username;
		password = copy.password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
