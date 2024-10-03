package com.qwert.BusSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwert.BusSystem.model.Route;
//import com.qwert.BusSystem.model.Ticket;
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
	@Override
	public void saveRoute(Route route) {
		// TODO Auto-generated method stub
		routeRepository.save(route);
	}
	@Override
	public String login(String to, String from) {
		// TODO Auto-generated method stub
		//List<Ticket> list=getAllTicket();
		List<Route> list=getAllRoute();
		for(Route rou:list) {
			if(to.equals(rou.getTo()) && from.equals(rou.getFrom())) {
				return rou.getTo();
			}
		}
		return "failure";
	}
	@Override
	public List<Route> getRouteByFrom(String from) {
		// TODO Auto-generated method stub
		return routeRepository.findByFrom(from);
	}

	
	
	
	
}
