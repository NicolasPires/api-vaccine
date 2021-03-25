package com.nksolucoes.apivaccine.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nksolucoes.apivaccine.entities.Register;
import com.nksolucoes.apivaccine.entities.VaccineApplication;

@RestController
@RequestMapping(value = "/vaccine-application")
public class VaccineApplicationResource {
	
	@GetMapping
	public ResponseEntity<VaccineApplication> findAll() {
		VaccineApplication v = new VaccineApplication(1L, "AstraZenica", "bing@gmail.com", Instant.parse("2021-03-24T22:14:00Z"));
		return ResponseEntity.ok().body(v);
	}
}
