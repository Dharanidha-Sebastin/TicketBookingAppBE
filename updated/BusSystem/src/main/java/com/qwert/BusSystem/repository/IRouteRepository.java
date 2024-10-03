package com.qwert.BusSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwert.BusSystem.model.Route;
//import com.qwert.BusSystem.model.Ticket;
//import com.qwert.BusSystem.model.Ticket;

@Repository
public interface IRouteRepository extends JpaRepository<Route, Integer> {
	Route findByTo(String too);
	//Ticket findByUsername(String name);
}
