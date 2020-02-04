package com.example.demo.controller;

import java.util.List;
import javax.ws.rs.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@Path("/user")
public class UserController {
	private Logger logger = LogManager.getLogger(UserController.class);
	@Autowired
	UserService service;
	@GetMapping("/all")
	public List<User> getAllUser() {
		logger.traceEntry();
		return logger.traceExit(service.getAllUser());
	}
	@GetMapping("/user_id/{id}")
	public User getUserById(@PathVariable int id) {
		logger.traceEntry();
		return logger.traceExit(service.getUserById(id));
	}

	@PostMapping("/user_insert")
	public String createUser(User user) {
		logger.traceEntry();
		String status = service.setUser(user);
		return logger.traceExit(status);
	}

}
