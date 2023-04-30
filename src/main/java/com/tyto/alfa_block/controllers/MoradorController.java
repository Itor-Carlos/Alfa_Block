package com.tyto.alfa_block.controllers;

import java.net.URI;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyto.alfa_block.dto.MoradorDTO;
import com.tyto.alfa_block.model.Morador;
import com.tyto.alfa_block.services.MoradorService;

import jakarta.validation.Valid;

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

   @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<?> salvarMorador(@RequestBody @Valid MoradorDTO moradorDTO){
      Morador moradorSalvo = this.moradorService.salvarMorador(moradorDTO.toMorador());
      URI newMoradorLocation = URI.create("/morador/"+moradorSalvo.getCpf()); 
      return ResponseEntity.created(newMoradorLocation).body(moradorSalvo);
   }
}
