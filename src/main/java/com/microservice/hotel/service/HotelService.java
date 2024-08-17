package com.microservice.hotel.service;

import java.util.List;

import com.microservice.hotel.entity.Hotel;

public interface HotelService {
	
	//create
	
	public Hotel createHotel(Hotel hotel);
	
	//get all
	public List<Hotel> getAllHotel();
	
	// get single
   public Hotel getHotel(String id);
} 
