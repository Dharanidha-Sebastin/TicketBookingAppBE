package com.qwert.BusSystem.service;

import java.util.List;

import com.qwert.BusSystem.model.Route;
//import com.qwert.BusSystem.model.Ticket;
//import com.qwert.BusSystem.model.Ticket;
//import com.qwert.BusSystem.model.Ticket;

public interface IRouteService {
	public void saveRoute(Route route);
	public List<Route> getAllRoute();
	public String login(String to, String from);
	public Route getRouteByTo(String to);
	//public String login(String username, String password);
	
	//public Ticket getTicketByName(String username);
}
