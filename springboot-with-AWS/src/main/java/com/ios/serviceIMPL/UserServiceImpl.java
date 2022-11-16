package com.ios.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ios.model.User;
import com.ios.repository.UserRepository;
import com.ios.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repoUserRepository;

	@Override
	public User saveUser(User user) {
		return repoUserRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {

		return null;
	}

	@Override
	public User getUserById(long userId) {

		return null;
	}

	@Override
	public User updateUser(User user, long userId) {

		return null;
	}

	@Override
	public ResponseEntity<Object> deleteUser(User user, long userId) {

		return null;
	}

}
