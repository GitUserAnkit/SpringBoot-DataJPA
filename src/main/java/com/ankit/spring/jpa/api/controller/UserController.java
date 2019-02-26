package com.ankit.spring.jpa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.spring.jpa.api.model.Users;
import com.ankit.spring.jpa.api.repository.UserRespository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRespository repository;
	
	@GetMapping("/find")
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	@PostMapping("/saveuser")
	public String saveUser(@RequestBody Users users){
		repository.save(users);
		return "User save "+users;
	}

}
