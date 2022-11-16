package com.ios.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ios.exception.UserNotFoundException;
import com.ios.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUserById(long userId) throws UserNotFoundException;

	User updateUser(User user, long userId) throws UserNotFoundException;

	ResponseEntity<Object> deleteUser(long userId) throws UserNotFoundException;

}
