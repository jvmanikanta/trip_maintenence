package com.mainteneceapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainteneceapp.model.Maintenence;
import com.mainteneceapp.service.IMaintenenceService;

@RestController
@RequestMapping("/maintenence-service")
public class MaintenenceController {

	@Autowired
	IMaintenenceService maintenenceService;
	
	@PutMapping("/maintenence")
	public Maintenence addMaintenence(@RequestBody Maintenence maintenence) {
		return maintenenceService.addMaintenence(maintenence);
	}
	
	@PutMapping("/maintenence")
	public Maintenence updateMaintenence(@RequestBody Maintenence maintenence) {
		return maintenenceService.updateMaintenence(maintenence);
	}
}
