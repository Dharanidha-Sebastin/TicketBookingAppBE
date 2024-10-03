package com.qwert.BusSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int route_id;
	private String from;
	private String to;
	private String time;
	private int seat;
	private String route_no;
	private String service;
	private String bus_no;
	private int bus_fare;
	private String trip_code;
	
	public int getRoute_id() {
		return route_id;
	}
	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	public String getRoute_no() {
		return route_no;
	}
	public void setRoute_no(String route_no) {
		this.route_no = route_no;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public int getBus_fare() {
		return bus_fare;
	}
	public void setBus_fare(int bus_fare) {
		this.bus_fare = bus_fare;
	}
	public String getTrip_code() {
		return trip_code;
	}
	public void setTrip_code(String trip_code) {
		this.trip_code = trip_code;
	}
	
	
	
}
