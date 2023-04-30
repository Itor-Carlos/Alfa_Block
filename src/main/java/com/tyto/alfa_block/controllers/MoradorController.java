package com.tyto.alfa_block.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyto.alfa_block.model.Morador;
import com.tyto.alfa_block.services.MoradorService;

@RestController
@RequestMapping(path = "/morador")
public class MoradorController {
   
   @Autowired
   private MoradorService moradorService;

   @GetMapping("/{cpf}")
   public ResponseEntity<?> buscaMoradorCpf(@PathVariable("cpf") String cpf){
      Morador moradorBuscado = this.moradorService.buscMoradorCpf(cpf);
      return ResponseEntity.ok(moradorBuscado);
   }

   @GetMapping(path = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<List<Morador>> listarMoradores(){
      return ResponseEntity.ok().body(this.moradorService.listarMoradores());
   }

}
