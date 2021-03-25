package com.nksolucoes.apivaccine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apivaccine.entities.VaccineApplication;

public interface VaccineApplicationRepository extends JpaRepository<VaccineApplication, Long>{

}
