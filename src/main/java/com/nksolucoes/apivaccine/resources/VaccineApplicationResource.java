package com.nksolucoes.apivaccine.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nksolucoes.apivaccine.entities.VaccineApplication;
import com.nksolucoes.apivaccine.service.VaccineApplicationService;

@RestController
@RequestMapping(value = "/vaccine-application")
public class VaccineApplicationResource {
	
	@Autowired
	private VaccineApplicationService service;
	
	@GetMapping
	public ResponseEntity<List<VaccineApplication>> findAll() {
		List<VaccineApplication> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<VaccineApplication> findById(@PathVariable Long id) {
		VaccineApplication obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<VaccineApplication> insert(@RequestBody VaccineApplication obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
