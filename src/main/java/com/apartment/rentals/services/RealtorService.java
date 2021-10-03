package com.apartment.rentals.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.rentals.entities.User;
import com.apartment.rentals.repositories.UserRepository;
import com.apartment.rentals.utilities.Constants;

@Service
public class RealtorService {
	
	@Autowired
	private UserRepository repository;

	public List<User> getAllRealtors(){
		return repository.findByRole(Constants.REALTOR);
	}
}
