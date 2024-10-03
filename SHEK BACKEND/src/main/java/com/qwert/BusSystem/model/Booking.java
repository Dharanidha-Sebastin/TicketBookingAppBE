package com.qwert.BusSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String route_no;
	private String time;
    private String date;
    private String booking_no;
    private String name;
    private String age;
    private String gender;
    private String adult_or_child;
    private String verification_type;
    private String verification_id;
    private String mobile_no;
    public int getId() {
	return id;
	}
	public String getRoute_no() {
	return route_no;
	}
	public void setRoute_no(String route_no) {
	this.route_no = route_no;
	}
	public String getTime() {
	return time;
	}
	public void setTime(String time) {
	this.time = time;
	}
	public String getDate() {
	return date;
	}
	public void setDate(String date) {
	this.date = date;
	}
	public String getBooking_no() {
	return booking_no;
	}
	public void setBooking_no(String booking_no) {
	this.booking_no = booking_no;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAge() {
	return age;
	}
	public void setAge(String age) {
	this.age = age;
	}
	public String getGender() {
	return gender;
	}
	public void setGender(String gender) {
	this.gender = gender;
	}
	public String getAdult_or_child() {
	return adult_or_child;
	}
	public void setAdult_or_child(String adult_or_child) {
	this.adult_or_child = adult_or_child;
	}
	public String getVerification_type() {
	return verification_type;
	}
	public void setVerification_type(String verification_type) {
	this.verification_type = verification_type;
	}
	public String getVerification_id() {
	return verification_id;
	}
	public void setVerification_id(String verification_id) {
	this.verification_id = verification_id;
	}
	public String getMobile_no() {
	return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
	}
}
