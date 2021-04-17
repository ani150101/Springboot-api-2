package com.liveasy.liveasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.liveasy.entities.Truck;
import com.liveasy.liveasy.services.Services;

@RestController
public class Controller {
	@Autowired
	private Services service;
	
	@GetMapping("/")
	public String home() {
		return "home sweet home";
	}
	
	@PostMapping("/load")
	public String trucks(@RequestBody Truck truck) {
		
		boolean check = service.addTruck(truck);
		if (check) return "load details are filled successfully";
		else return "details could not be filled";
	}
}
