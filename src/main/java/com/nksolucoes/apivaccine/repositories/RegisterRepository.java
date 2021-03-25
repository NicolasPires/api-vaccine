package com.nksolucoes.apivaccine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apivaccine.entities.Register;

public interface RegisterRepository extends JpaRepository<Register, Long>{

}
