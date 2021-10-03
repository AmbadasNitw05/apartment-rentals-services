package com.apartment.rentals.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apartment.rentals.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findByRole(String role);
		
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByEmailAndPassword(String email, String password);
	
	@Query(value="select u.* from User u "
			+ "where u.first_name like %:searchText% "
			+ "or u.last_name like %:searchText% "
			+ "or u.email like %:searchText%", nativeQuery = true)
	public List<User> findAllBySearchText(String searchText);
}
