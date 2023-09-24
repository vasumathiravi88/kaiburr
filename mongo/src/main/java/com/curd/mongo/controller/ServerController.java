package com.curd.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.curd.mongo.model.server;
import com.curd.mongo.service.service;

@RestController
@RequestMapping("/server/")
public class ServerController {
	
	@Autowired
	
	service service;
	@PostMapping("/save")
	public ResponseEntity<String> createservice(@RequestBody server server){
		
		return new ResponseEntity<String>(service.saveServer(server),HttpStatus.OK);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<server>>readAllserver(){
		return new ResponseEntity<List<server>>(service.getAllserver(),HttpStatus.OK);
	}
	
		
	

	

}
