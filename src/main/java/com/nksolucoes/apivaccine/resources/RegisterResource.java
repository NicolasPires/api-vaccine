package com.nksolucoes.apivaccine.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nksolucoes.apivaccine.entities.Register;

@RestController
@RequestMapping(value = "/register")
public class RegisterResource {
	
	@GetMapping
	public ResponseEntity<Register> findAll() {
		Register c = new Register(1, 00011122233, "Chandler Bing", "bing@gmail.com", Instant.parse("2021-03-24T22:14:00Z"));
		return ResponseEntity.ok().body(c);
	}
}
