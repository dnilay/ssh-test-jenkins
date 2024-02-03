package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public ResponseEntity<?> status() throws UnknownHostException
	{
		return ResponseEntity.ok("status ok. ip: "+InetAddress.getLocalHost().toString());
	}
}
