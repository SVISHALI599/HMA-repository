package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@RestController
public class UserController {
	UserMapper mapper;

	public UserController(UserMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/all")

	public List<User> getAllUser() {
		return mapper.getAllUser();
	}

	@GetMapping("/userid/{id}")

	public User getUserById(@PathParam("id") int id) {
		return mapper.getUserById(id);
	}
	@PostMapping("/userinsert")
	public User setUser(@PathParam("user_name") String user_name,
			@PathParam("user_password") String user_password, @PathParam("user_age") Integer user_age,
			@PathParam("user_gender") String user_gender,
			@PathParam("user_mobile_number") String user_mobile_number,
			@PathParam("user_email_id") String user_email_id,
			@PathParam("user_address_line1") String user_address_line1,
			@PathParam("user_address_line2") String user_address_line2,
			@PathParam("user_address_line3") String user_address_line3) {
		return mapper.setUser();
	}

}
