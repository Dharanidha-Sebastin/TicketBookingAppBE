package com.qwert.BusSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qwert.BusSystem.model.Route;

import com.qwert.BusSystem.service.IRouteService;

@CrossOrigin
@RestController
@RequestMapping("/route")

public class RouteController {
	@Autowired
	IRouteService routeService;
	@PostMapping("/addRoute")
	public String addRoute(@RequestBody Route route) {
		routeService.saveRoute(route);
		return "Newly added";
		
	}
	
	@GetMapping("/getAllRoute")
	public List<Route> getRoute(){
		List<Route> list1=routeService.getAllRoute();
		return list1;
	}
	
	@PostMapping("/login")
	public String loginRoute(@RequestBody Route route) {
		String status=routeService.login(route.getTo(), route.getFrom());
		return status;
	}
	@GetMapping("/getRoute")
	public Route getRouteByTo(@RequestParam String to) {
		 Route rt = routeService.getRouteByTo(to);
		 return rt;
	}
	
}
