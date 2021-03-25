package com.nksolucoes.apivaccine.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nksolucoes.apivaccine.entities.Register;
import com.nksolucoes.apivaccine.repositories.RegisterRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Register r1 = new Register(null, 00011122233, "Luck Pires", "luck@gmail.com", Instant.parse("2017-04-10T13:50:07Z"));
		Register r2 = new Register(null, 00011122233, "Théo Rodrigues", "theo@gmail.com", Instant.parse("2019-12-24T19:20:07Z"));
		
		registerRepository.saveAll(Arrays.asList(r1, r2));
	}
	
	

}
