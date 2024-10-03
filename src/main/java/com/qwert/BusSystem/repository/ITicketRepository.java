package com.qwert.BusSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qwert.BusSystem.model.Ticket;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Integer> {
	Ticket findByUsername(String name);
	
	
}
