package com.ait.mx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/saludo")
	public 	ResponseEntity saludame(){
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
