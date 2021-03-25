package com.nksolucoes.apivaccine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nksolucoes.apivaccine.entities.VaccineApplication;
import com.nksolucoes.apivaccine.repositories.VaccineApplicationRepository;

@Service
public class VaccineApplicationService {
	
	@Autowired
	private VaccineApplicationRepository repository;
	
	public List<VaccineApplication> findAll(){
		return repository.findAll();
	}
	
	public VaccineApplication findById(Long id) {
		Optional<VaccineApplication> obj = repository.findById(id);
		return obj.get();
	}
	
	public VaccineApplication insert(VaccineApplication obj) {
		return repository.save(obj);
	}

}
