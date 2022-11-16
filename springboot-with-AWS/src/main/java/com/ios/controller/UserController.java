package com.ios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ios.model.User;
import com.ios.service.UserService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/userapp")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	// create user api
	@PostMapping("/saveuser")
	public User createUser(@RequestBody User user) {
		log.info("Create User Call Started...!");
		return userService.saveUser(user);
	}

	// get all users api
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		log.info("getAllUsers call Stared..!");
		return userService.getAllUsers();
	}

	// get user by id api
	@GetMapping("/getuserbyid/{userId}")
	public User getUserById(@PathVariable("userId") long userId) {
		return userService.getUserById(userId);
	}

	// update user api
	@PutMapping("/updateuser/{userId}")
	public User updateUser(@RequestBody User user, @PathVariable("userId") long userId) {
		return userService.updateUser(user, userId);
	}

	// delete user api
	@DeleteMapping("/deleteuser/{userId}")
	public ResponseEntity<Object> deleteUser(@RequestBody User user, @PathVariable("userId") long userId) {
		return userService.deleteUser(user, userId);
	}
}
