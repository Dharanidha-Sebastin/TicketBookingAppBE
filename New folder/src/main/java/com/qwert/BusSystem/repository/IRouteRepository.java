package com.qwert.BusSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwert.BusSystem.model.Route;

@Repository
public interface IRouteRepository extends JpaRepository<Route, Integer> {
	
}
