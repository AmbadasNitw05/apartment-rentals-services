package com.apartment.rentals.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.apartment.rentals.entities.Apartment;
import com.apartment.rentals.exception.ApiRequestException;
import com.apartment.rentals.repositories.ApartmentRepository;

@Service
public class ApartmentService {

	@Autowired
	private ApartmentRepository repository;
	
	public List<Apartment> getAll(){
		return repository.findAll();
	}
	
	public List<Apartment> getAllByRole(String role){
		if("Client".equalsIgnoreCase(role))
			return repository.findByStatus("Available");
		
		return repository.findAll();
	}
	
	public List<Apartment> getAllBySearchText(String searchText, String role){
		if("Client".equalsIgnoreCase(role))
			return repository.findAvailableBySearchText(searchText);
		
		return repository.findAllBySearchText(searchText);
	}
	
	public List<Apartment> getAllByFilter(String role, String priceRange, String sizeRange, String rooms){
		return repository.findAll(new Specification<Apartment>() {

			@Override
			public Predicate toPredicate(Root<Apartment> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<>();
				
				if("Client".equalsIgnoreCase(role))
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("status"), "Available")));
				
				if(priceRange != null && !priceRange.isEmpty()) {
					String[] ranges = priceRange.split("-");
					if(ranges.length == 2) {
						try {
							int range1 = Integer.parseInt(ranges[0]);
							int range2 = Integer.parseInt(ranges[1]);
							predicates.add(criteriaBuilder.and(criteriaBuilder.between(root.get("pricePerMonth"), range1, range2)));
						}catch(NumberFormatException nfe) {
							throw new ApiRequestException("Invalid input range", nfe);
						}
					}else {
						throw new ApiRequestException("Invalid input range");
					}
				}
				
				if(sizeRange != null && !sizeRange.isEmpty()) {
					String[] ranges = sizeRange.split("-");
					if(ranges.length == 2) {
						try {
							int range1 = Integer.parseInt(ranges[0]);
							int range2 = Integer.parseInt(ranges[1]);
							predicates.add(criteriaBuilder.and(criteriaBuilder.between(root.get("floorAreaSize"), range1, range2)));
						}catch(NumberFormatException nfe) {
							throw new ApiRequestException("Invalid input range", nfe);
						}
					}else {
						throw new ApiRequestException("Invalid input range");
					}
				}
				
				if(rooms != null && !rooms.isEmpty()) {
					try {
						int numberOfRooms = Integer.parseInt(rooms);
						predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("numberOfRooms"), numberOfRooms)));
					}catch(NumberFormatException nfe) {
						throw new ApiRequestException("Invalid input range", nfe);
					}
				}
				
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
			
		});
	}
	
	
	public List<Apartment> getAllByRealtor(long id){
		return repository.findByRealtorId(id);
	}
	
	public Optional<Apartment> get(long id) {
		return repository.findById(id);
	}
	
	public Apartment add(Apartment apartment) {
		return repository.save(apartment);
	}
	
	public Apartment update(Apartment apartment) {
		return repository.save(apartment);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
}
