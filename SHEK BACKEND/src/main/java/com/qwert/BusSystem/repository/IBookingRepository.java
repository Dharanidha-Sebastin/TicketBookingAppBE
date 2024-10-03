package com.qwert.BusSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwert.BusSystem.model.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Integer> {

}
