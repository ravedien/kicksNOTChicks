package com.poc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.domain.Kicks;
import com.poc.service.KicksService;

@RestController
public class KicksController {
	
	private final Logger logger = LoggerFactory.getLogger(KicksController.class);
	
	private KicksService kicksService;

	public KicksController(KicksService kicksService) {
		this.kicksService = kicksService;
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public Kicks getKicksByName(@PathVariable int id){
		Kicks kicks =  kicksService.findById(id);
		logger.debug(kicks.toString());
		return kicks;
	}
	
}
