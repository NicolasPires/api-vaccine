package com.nksolucoes.apivaccine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nksolucoes.apivaccine.entities.Register;
import com.nksolucoes.apivaccine.repositories.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repository;
	
	public List<Register> findAll(){
		return repository.findAll();
	}
	
	public Register findById(Long id) {
		Optional<Register> obj = repository.findById(id);
		return obj.get();
	}
	
	public Register insert(Register obj) {
		return repository.save(obj);		
	}

}
