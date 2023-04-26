package com.tyto.alfa_block.repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyto.alfa_block.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{
   
}
