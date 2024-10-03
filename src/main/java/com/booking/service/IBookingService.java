package com.booking.service;

import java.util.List;

import com.booking.model.Booking;

public interface IBookingService {
           public void saveBooking(Booking booking);
           public List<Booking> getAllBooking();
//           public String login(String name,String password);
}
