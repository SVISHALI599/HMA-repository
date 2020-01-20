package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Service
@Path("/user")
public class UserService {
	private Logger logger = LogManager.getLogger(UserService.class);
	@Autowired
	UserMapper mapper;

	public String setUser(User user) {
		logger.traceEntry();
		int rowsAffected = mapper.setUser(user);
		if (rowsAffected == 1)
			return logger.traceExit("Success");
		else
			return logger.traceExit("Try again");

	}

	public User getUserById(int id) {
		logger.traceEntry();
		return logger.traceExit(mapper.getUserById(id));
	}

	public List<User> getAllUser() {
		logger.traceEntry();
		return logger.traceExit(mapper.getAllUser());
	}

}
