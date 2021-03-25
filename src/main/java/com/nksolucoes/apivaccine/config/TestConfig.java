package com.nksolucoes.apivaccine.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nksolucoes.apivaccine.entities.Register;
import com.nksolucoes.apivaccine.entities.VaccineApplication;
import com.nksolucoes.apivaccine.repositories.RegisterRepository;
import com.nksolucoes.apivaccine.repositories.VaccineApplicationRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private VaccineApplicationRepository vaccineAppRepository;

	@Override
	public void run(String... args) throws Exception {
		
		VaccineApplication v1 = new VaccineApplication(null, "Pfizer", "luck@gmail.com" , Instant.parse("2021-10-10T14:30:00Z"));
		VaccineApplication v2 = new VaccineApplication(null, "Sinovac", "sem-email@teste" , Instant.parse("2022-07-20T16:45:00Z"));
		VaccineApplication v3 = new VaccineApplication(null, "Covishield", "sem-email@teste" , Instant.parse("2022-08-20T08:45:00Z"));
		VaccineApplication v4 = new VaccineApplication(null, "Sputnik", "theo@gmail.com" , Instant.parse("2022-09-20T19:45:00Z"));		
		
		
		Register r1 = new Register(null, 00011122233, "Luck Pires", "luck@gmail.com", Instant.parse("2017-04-10T13:50:00Z"), v1);		
		Register r2 = new Register(null, 00011122233, "Théo Rodrigues", "theo@gmail.com", Instant.parse("2019-12-24T19:20:07Z"), v4);
		
		vaccineAppRepository.saveAll(Arrays.asList(v1, v2, v3, v4));		
		registerRepository.saveAll(Arrays.asList(r1, r2));	
		
	}
	
	

}
