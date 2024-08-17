package com.microservice.hotel.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.microservice.hotel.entity.Hotel;
import com.microservice.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	private HotelRepository hotelrepo;
	
	public HotelServiceImpl(HotelRepository hotelrepo) {
		this.hotelrepo=hotelrepo;
	}
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelid = UUID.randomUUID().toString();
		hotel.setId(hotelid);
		return hotelrepo.save(hotel);
	}

		

	@Override
	public List<Hotel> getAllHotel() {
		List<Hotel> getall = hotelrepo.findAll();	
		if(!getall.isEmpty())
		{
			return getall;
		}
		return Collections.emptyList();
	}

	@Override
	public Hotel getHotel(String id) {
		Optional<Hotel> gethotel = hotelrepo.findById(id);
		if(gethotel.isPresent()) {
			return gethotel.get();	
		}
		return null;
	}

}
