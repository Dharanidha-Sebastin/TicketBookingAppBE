package com.qwert.BusSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qwert.BusSystem.model.Booking;
import com.qwert.BusSystem.service.IBookingService;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	IBookingService bookingService;

	//localhost:8080/eticket/addBooking
	@PostMapping("/addBooking")
	public String addBooking(@RequestBody Booking booking) {
	bookingService.saveBooking(booking);
	return "Booking Added";
	}

	@GetMapping("/getAllBooking")
	public List<Booking> getAllBooking(){
	List<Booking> list=bookingService.getAllBooking();
	return list;

	} 
}
