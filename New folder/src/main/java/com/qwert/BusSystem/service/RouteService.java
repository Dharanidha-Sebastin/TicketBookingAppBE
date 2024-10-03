package com.qwert.BusSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwert.BusSystem.model.Route;
//import com.qwert.BusSystem.model.Ticket;
import com.qwert.BusSystem.repository.IRouteRepository;
//import com.qwert.BusSystem.repository.ITicketRepository;

@Service
public class RouteService implements IRouteService{
	@Autowired
	IRouteRepository routeRepository;
	@Override
	public List<Route> getAllRoute() {
		// TODO Auto-generated method stub
		List<Route> list1=routeRepository.findAll();
		return list1;
		
	}

}
