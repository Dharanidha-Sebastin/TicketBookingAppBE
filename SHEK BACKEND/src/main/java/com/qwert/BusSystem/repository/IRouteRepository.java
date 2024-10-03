package com.qwert.BusSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwert.BusSystem.model.Route;
//import com.qwert.BusSystem.model.Ticket;
//import com.qwert.BusSystem.model.Ticket;

@Repository
public interface IRouteRepository extends JpaRepository<Route, Integer> {
	List<Route> findByFrom(String from);
	//Ticket findByUsername(String name);
}
