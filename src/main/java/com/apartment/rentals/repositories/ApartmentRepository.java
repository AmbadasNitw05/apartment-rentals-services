package com.apartment.rentals.repositories;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apartment.rentals.entities.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

	public List<Apartment> findByRealtorId(long id);
	
	public List<Apartment> findAll(Specification<Apartment> specification);

	@Query(value="select a.* from Apartment a, User u "
			+ "where a.realtor_id = u.user_id and u.role = ?1", nativeQuery = true)
	public List<Apartment> findAllByRole(String role);
	
	@Query(value="select a.* from Apartment a "
			+ "where a.name like %:searchText% or a.description like %:searchText%", nativeQuery = true)
	public List<Apartment> findAllBySearchText(String searchText);
	
	@Query(value="select a.* from Apartment a "
			+ "where (a.name like %:searchText% "
			+ "or a.description like %:searchText%) "
			+ "and a.status='Available'", nativeQuery = true)
	public List<Apartment> findAvailableBySearchText(String searchText);
	
	
	public List<Apartment> findByStatus(String status);
}
