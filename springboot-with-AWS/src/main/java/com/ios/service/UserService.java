package com.ios.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ios.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUserById(long userId);

	User updateUser(User user, long userId);

	ResponseEntity<Object> deleteUser(User user, long userId);

}
