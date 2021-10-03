package com.apartment.rentals.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long apartmentId;
	
	private String name;	
	private String description;
	private int floorAreaSize;
	private double pricePerMonth;
	private int numberOfRooms;
	private double longitude;
	private double latitude;
	private Date dateAdded;
	private long realtorId;
	private String status;
	
	public long getApartmentId() {
		return apartmentId;
	}
	public void setApartmentId(long apartmentId) {
		this.apartmentId = apartmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFloorAreaSize() {
		return floorAreaSize;
	}
	public void setFloorAreaSize(int floorAreaSize) {
		this.floorAreaSize = floorAreaSize;
	}
	public double getPricePerMonth() {
		return pricePerMonth;
	}
	public void setPricePerMonth(double pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public long getRealtorId() {
		return realtorId;
	}
	public void setRealtorId(long realtorId) {
		this.realtorId = realtorId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
