package com.apartment.rentals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.rentals.entities.User;
import com.apartment.rentals.services.RealtorService;

@RestController
@RequestMapping("realtor")
public class RealtorController {

	@Autowired
	private RealtorService service;
	
	@GetMapping
	public List<User> getAllRealtors(){
		return service.getAllRealtors();
	}
}
