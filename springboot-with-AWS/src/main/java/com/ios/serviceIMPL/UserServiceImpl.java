package com.ios.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ios.exception.UserNotFoundException;
import com.ios.model.User;
import com.ios.repository.UserRepository;
import com.ios.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long userId) throws UserNotFoundException {
		return userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User Not Found Exception..!"));
	}

	@Override
	public User updateUser(User user, long userId) throws UserNotFoundException {
		User existingUser = userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User Not Found..!"));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		return userRepository.save(existingUser);
	}

	@Override
	public ResponseEntity<Object> deleteUser(long userId) throws UserNotFoundException {

		User foudUser = userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User Not Found..!"));
		userRepository.delete(foudUser);
		return new ResponseEntity<>("User Deleted Successfully...", HttpStatus.NO_CONTENT);
	}

}
