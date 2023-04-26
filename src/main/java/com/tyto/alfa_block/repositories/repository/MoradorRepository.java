package com.tyto.alfa_block.repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyto.alfa_block.model.Morador;


public interface MoradorRepository extends JpaRepository<Morador, String>{
   
}
