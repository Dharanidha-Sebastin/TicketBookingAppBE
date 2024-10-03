package com.qwert.BusSystem.service;

import java.util.List;

import com.qwert.BusSystem.model.Ticket;

public interface ITicketService {
	public void saveTicket(Ticket ticket);
	
	public List<Ticket> getAllTicket();
	
	public String login(String username, String password);
	
	public Ticket getTicketByName(String username);
}
