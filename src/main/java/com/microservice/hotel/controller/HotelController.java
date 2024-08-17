package com.microservice.hotel.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.hotel.entity.Hotel;
import com.microservice.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	
	private HotelService hotelservice;
	
	
	public HotelController(HotelService hotelservice) {
		this.hotelservice=hotelservice;
	}
	
	// create
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelservice.createHotel(hotel));
		
	}
	// get single
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String id){
		return ResponseEntity.status(HttpStatus.OK).body(hotelservice.getHotel(id));
		
	}
	
	// get all
@GetMapping("/")
public ResponseEntity<List<Hotel>> getAll(){
	return ResponseEntity.ok(hotelservice.getAllHotel());
	
}
	
}
