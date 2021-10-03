package com.apartment.rentals.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.rentals.entities.User;
import com.apartment.rentals.services.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:3000")
@Validated
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public List<User> getAll(){
		return service.getAll();
	}
	
	@GetMapping
	@RequestMapping("{email}/{pwd}")
	public Optional<User> getUserByEmailAndPassword(@PathVariable String email, 
			@PathVariable String pwd) {
		return service.getUserByEmailAndPassword(email, pwd);
	}
	
	@GetMapping(path = "{id}")
	public Optional<User> get(@PathVariable("id") long id) {
		return service.get(id);
	}	
	
	@GetMapping
	@RequestMapping("search")
	public List<User> getAllBySearchText(@RequestParam(name = "searchText") String searchText) {
		return service.getAllBySearchText(searchText);
	}
		
	@PostMapping
	public User add(@RequestBody User user) {
		return service.add(user);
	}
	
	@PutMapping
	public User update(@RequestBody User user) {
		return service.update(user);
	}
	
	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable("id") long id) {
		service.delete(id);
	}
	
}
