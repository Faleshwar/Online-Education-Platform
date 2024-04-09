package com.onlineeducation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineeducation.model.Login;
import com.onlineeducation.model.User;
import com.onlineeducation.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	public List<User> getUsers(){
		return repo.findAll();
	}


	public void addUser(User user) {
		
		repo.save(user);
	}
	
	public User getUserByName(String username) {
		Optional<User> optionalUser = repo.findByName(username);
		if(optionalUser == null) {
			throw new RuntimeException("User not found with username "+username);
		}
		
		
		return optionalUser.get();
	}


	public User getUserById(Integer id) {
		Optional<User> optionalUser = repo.findById(id);
		if(optionalUser == null) {
			throw new RuntimeException("User not found with id "+id);
		}
		return optionalUser.get();
	}
	
	public boolean checkByUserNameAndPassword(Login login) {
		Optional<User> optionalUser = repo.findByName(login.getUsername());
		if(optionalUser == null) {
			throw new RuntimeException("User not found with username "+login.getUsername());
		}
		
		User user = optionalUser.get();
		
		if(login.getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
