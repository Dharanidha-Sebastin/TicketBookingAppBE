package com.booking.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.model.Booking;
import com.booking.repository.IBookingRepository;
@Service
public class BookingService implements IBookingService {
	@Autowired
    IBookingRepository bookingRepository;
	@Override
	public void saveBooking(Booking booking) {
		bookingRepository.save(booking);
		}

	@Override
	public List<Booking> getAllBooking() {
		 List<Booking> list=bookingRepository.findAll();
		return list;
	}
	

}
