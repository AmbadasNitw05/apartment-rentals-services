package com.apartment.rentals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.rentals.entities.User;
import com.apartment.rentals.services.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping
	public List<User> getAllClients(){
		return service.getAllClients();
	}
	
	
}
