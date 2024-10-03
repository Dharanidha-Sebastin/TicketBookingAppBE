package com.qwert.BusSystem.service;

import java.util.List;

import com.qwert.BusSystem.model.Booking;

public interface IBookingService {
	public void saveBooking(Booking booking);
    public List<Booking> getAllBooking();
}
