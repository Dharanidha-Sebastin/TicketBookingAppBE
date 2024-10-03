package com.qwert.BusSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwert.BusSystem.model.Booking;
import com.qwert.BusSystem.repository.IBookingRepository;

@Service
public class BookingService implements IBookingService{
	@Autowired
    IBookingRepository bookingRepository;

	@Override
	public void saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.save(booking);
		
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		List<Booking> list=bookingRepository.findAll();
		return list;
	}
	
}
