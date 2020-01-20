package com.example.demo.service;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Service
@Path("/service/user")
public class UserService {
	@Autowired
	UserMapper mapper;

	public String setUser(User user) {
		// TODO Auto-generated method stub
		int rowsAffected=mapper.setUser(user);
		if(rowsAffected==1)
			return "Success";
		else
			return "Try again";

	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return mapper.getUserById(id);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return mapper.getAllUser();
	}

}
