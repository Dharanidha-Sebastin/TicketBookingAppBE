package com.qwert.BusSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwert.BusSystem.model.Route;

public interface IRouteRepository extends JpaRepository<Route, Integer> {

}
