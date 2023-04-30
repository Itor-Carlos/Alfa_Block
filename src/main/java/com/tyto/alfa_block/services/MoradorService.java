package com.tyto.alfa_block.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyto.alfa_block.exceptions.moradorExceptions.MoradorNotFoundException;
import com.tyto.alfa_block.model.Morador;
import com.tyto.alfa_block.repositories.repository.MoradorRepository;

@Service
public class MoradorService {
   
   @Autowired
   private MoradorRepository moradorRepository;

   public Morador buscMoradorCpf(String cpf){
      Optional<Morador> morador = this.moradorRepository.findById(cpf);
      if(morador.isEmpty()){
         throw new MoradorNotFoundException();
      }
      else return morador.get();
   }

}
