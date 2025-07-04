package com.simple.spring_angular_deployment.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.spring_angular_deployment.hibernate.WebCounter;
import com.simple.spring_angular_deployment.hibernate.WebCounterService;

@RestController
@RequestMapping("/api/system")
public class SystemController {

	@Autowired
	WebCounterService wcService;


	@GetMapping("/version")
	public ResponseEntity<Map<String, String>> getVersion() {
		return ResponseEntity.ok(Map.of("version", "2.3.5"));
	}

	@GetMapping("/counter")
	public ResponseEntity<Integer> getCounter() {
	    WebCounter wc =	wcService.increment();

		return ResponseEntity.ok(wc.GetCount());
	}
}
