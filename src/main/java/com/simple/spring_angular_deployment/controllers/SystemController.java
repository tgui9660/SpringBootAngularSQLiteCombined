package com.simple.spring_angular_deployment.controllers;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/system")
public class SystemController {

	@GetMapping("/version")
	public ResponseEntity<Map<String, String>> getVersion() {
		return ResponseEntity.ok(Map.of("version", "1.2.4"));
	}

}
