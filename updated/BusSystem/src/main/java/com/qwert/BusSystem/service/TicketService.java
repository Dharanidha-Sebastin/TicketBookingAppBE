package com.qwert.BusSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwert.BusSystem.model.Ticket;
import com.qwert.BusSystem.repository.ITicketRepository;



@Service
public class TicketService implements ITicketService{
	
	
	@Autowired
	ITicketRepository ticketRepository;
	@Override
	
	public void saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		List<Ticket> list=ticketRepository.findAll();
		return list;
	}

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		List<Ticket> list=getAllTicket();
		for(Ticket tic:list) {
			if(username.equals(tic.getUsername()) && password.equals(tic.getPassword())) {
				return tic.getUsername();
			}
		}
		return "failure";
	}

	@Override
	public Ticket getTicketByName(String username) {
		// TODO Auto-generated method stub
		return ticketRepository.findByUsername(username);
	}

}
