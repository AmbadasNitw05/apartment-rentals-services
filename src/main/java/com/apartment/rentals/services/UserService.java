package com.apartment.rentals.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.rentals.entities.User;
import com.apartment.rentals.exception.ApiRequestException;
import com.apartment.rentals.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> getAll(){
		return repository.findAll();
	}
	
	public Optional<User> getUserByEmailAndPassword(String email, String password) {
		Optional<User> user = repository.findByEmailAndPassword(email, password);
		System.out.println("user: " + user);
		if(!user.isPresent()) {
			throw new ApiRequestException("No User exists.");
		}
		return user;
	}
	
	public Optional<User> get(long id) {
		return repository.findById(id);
	}
	
	public List<User> getAllBySearchText(String searchText){
		return repository.findAllBySearchText(searchText);
	}
	
	public User add(User user) {
		Optional<User> existingUser = repository.findByEmail(user.getEmail());
		if(existingUser.isPresent())
			throw new ApiRequestException("Email already exists.");
		return repository.save(user);
	}
	
	public User update(User user) {
		Optional<User> curEntry = repository.findById(user.getUserId());
		if(!curEntry.isPresent())
			throw new ApiRequestException("User doesn't exist.");
		
		if(user.getPassword() == null || user.getPassword().isEmpty()) {
			user.setPassword(curEntry.get().getPassword());
		}
		
		return repository.save(user);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
}
