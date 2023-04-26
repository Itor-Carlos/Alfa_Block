package com.tyto.alfa_block.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "morador")
public class Morador {
   
   @Id
   @Column(length = 11, nullable = false)
   private String cpf;

   @Column(length = 50, nullable = false)
   private String name;

   @Column(nullable = false)
   private Integer numeroApartamento;

   @Column(length = 40, nullable = false)
   private String email;  

   @Column(length = 9, nullable = false)
   private String telefone;

   @OneToMany(mappedBy = "cpfMorador")
   private List<Topico> topicos = new ArrayList<>();

   @OneToMany(mappedBy = "cpfMoradorCriador")
   private List<Comentario> comentarios = new ArrayList<>();

   public Morador(){}

   public Morador(String cpf, String name, String email, Integer numeroApartamento, String telefone){
      this.cpf = cpf;
      this.name = name;
      this.email = email;
      this.numeroApartamento = numeroApartamento;
      this.telefone = telefone;
   }

   public Morador(String cpf, String name, String email, Integer numeroApartamento, String telefone, List<Topico> topicos){
      this.cpf = cpf;
      this.name = name;
      this.email = email;
      this.numeroApartamento = numeroApartamento;
      this.telefone = telefone;
      this.topicos = topicos;
   }

   public String getCpf() {
      return cpf;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getNumeroApartamento() {
      return numeroApartamento;
   }

   public void setNumeroApartamento(Integer numeroApartamento) {
      this.numeroApartamento = numeroApartamento;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public List<Topico> getTopicos(){
      return this.topicos;
   }

   public void setTopicos(List<Topico> topicos){
      this.topicos = topicos;
   }

   public void addTopico(Topico topico){
      this.topicos.add(topico);
   }
   

}