package com.apartment.rentals.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.apartment.rentals.entities.Apartment;
import com.apartment.rentals.services.ApartmentService;

@RestController
@RequestMapping("apartment")
@CrossOrigin(origins = "http://localhost:3000")
public class ApartmentController {

	@Autowired
	private ApartmentService service;
	
	@GetMapping	
	public List<Apartment> getAll() {
		return service.getAll();
	}
	
	@GetMapping
	@RequestMapping("filter")
	public List<Apartment> getAllByRole(@RequestParam(name = "role") String role) {
		return service.getAllByRole(role);
	}
	
	@GetMapping
	@RequestMapping("search")
	public List<Apartment> getAllBySearchText(@RequestParam(name = "role") String role,
			@RequestParam(name = "searchText") String searchText) {
		return service.getAllBySearchText(searchText, role);
	}
	
	@GetMapping
	@RequestMapping("filters")
	public List<Apartment> getAllByFilter(@RequestParam(name = "role") String role,
			@RequestParam(name = "priceRange") String priceRange,
			@RequestParam(name = "sizeRange") String sizeRange,
			@RequestParam(name = "rooms") String rooms) {
		return service.getAllByFilter(role, priceRange, sizeRange, rooms);
	}
	
	@GetMapping(path = "{id}")
	public Optional<Apartment> get(@PathVariable("id") long id) {
		return service.get(id);
	}
	
	@GetMapping(path = "realtor/{id}")
	public List<Apartment> getByRealtorId(@PathVariable("id") long id) {
		return service.getAllByRealtor(id);
	}
	
	@PostMapping
	public Apartment add(@RequestBody Apartment apartment) {
		return service.add(apartment);
	}
	
	@PutMapping
	public Apartment update(@RequestBody Apartment apartment) {
		return service.update(apartment);
	}
	
	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable("id") long id) {
		service.delete(id);
	}
	
}
