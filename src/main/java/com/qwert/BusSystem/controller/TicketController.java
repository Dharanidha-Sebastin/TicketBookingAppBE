package com.qwert.BusSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qwert.BusSystem.model.Ticket;
import com.qwert.BusSystem.service.ITicketService;


@CrossOrigin
@RestController
@RequestMapping("/ticket")

public class TicketController {
	//localhost:8080/ticket
	
	@Autowired
	ITicketService ticketService;
	@PostMapping("/addTicket")
	public String addTicket(@RequestBody Ticket ticket) {
		ticketService.saveTicket(ticket);
		return "Newly added";
		
	}
	
	@GetMapping("/getAllTicket")
	public List<Ticket> getTicket(){
		
		List<Ticket> list=ticketService.getAllTicket();
		return list;
		
	}
	
	@PostMapping("/login")
	public String loginStudent(@RequestBody Ticket ticket) {
		String status=ticketService.login(ticket.getUsername(), ticket.getPassword());
		return status;
		
	}
	
	@GetMapping("/getDetails")
	public Ticket getTicketByName(@RequestParam String username) {
		return ticketService.getTicketByName(username);
		
	}
	
}
