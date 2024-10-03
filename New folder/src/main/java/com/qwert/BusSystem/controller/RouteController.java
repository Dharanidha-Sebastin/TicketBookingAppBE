package com.qwert.BusSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.qwert.BusSystem.model.Route;

import com.qwert.BusSystem.service.IRouteService;

@CrossOrigin
@RestController
@RequestMapping("/route")

public class RouteController {
	@Autowired
	IRouteService routeService;
//	@PostMapping("/addTicket")
//	public String addTicket(@RequestBody Ticket ticket) {
//		ticketService.saveTicket(ticket);
//		return "Newly added";
//		
//	}
	
	@GetMapping("/getAllRoute")
	public List<Route> getRoute(){
		List<Route> list1=routeService.getAllRoute();
		return list1;
	}
	
//	@PostMapping("/login")
//	public String loginStudent(@RequestBody Ticket ticket) {
//		String status=ticketService.login(ticket.getUsername(), ticket.getPassword());
//		return status;
//		
//	}
//	
//	@GetMapping("/getDetails")
//	public Ticket getTicketByName(@RequestParam String username) {
//		return ticketService.getTicketByName(username);
//		
//	}
	
}
