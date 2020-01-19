package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@Path("/controller/user")
public class UserController {
	@Autowired
	UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping("/all")

	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("/userid/{id}")

	public User getUserById(@PathParam("id") int id) {
		return service.getUserById(id);
	}

	@PostMapping("/userinsert")
	public User setUser(User user) {
		return service.setUser();
	}

}
