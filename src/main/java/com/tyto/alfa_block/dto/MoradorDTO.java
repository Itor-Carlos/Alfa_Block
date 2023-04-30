package com.tyto.alfa_block.dto;

import org.hibernate.validator.constraints.Length;

import com.tyto.alfa_block.model.Morador;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MoradorDTO {
   
   @NotBlank(message = "O campo cpf do morador não pode ser nulo ou vazio.")
   @Length(min = 11,max = 11, message = "O campo cpf deve conter 11 caracteres")
   private String cpf;

   @NotBlank(message = "O campo name do morador não pode ser nulo ou vazio.")
   @Length(min = 3,max = 50, message = "O campo name do morador deve conter um mínimo de 3 e máximo de 5 caracteres")
   private String name;

   @NotNull(message = "O campo numeroApartamento do morador não pode ser nulo ou vazio.")
   private Integer numeroApartamento;

   @NotBlank(message = "O campo email do morador não pode ser nulo ou vazio.")
   @Length(min = 20, max = 40, message = "O campo email deve conter um mínimo de 20 e máximo de 70 caracteres")
   private String email;

   @NotBlank(message = "O campo name do morador não pode ser nulo ou vazio.")
   @Length(min = 9, max = 9, message = "O campo telefone deve conter 9 caracteres")
   private String telefone;

   public MoradorDTO() {
   }

   public MoradorDTO(String cpf, String name, Integer numeroApartamento, String email, String telefone) {
      this.cpf = cpf;
      this.name = name;
      this.numeroApartamento = numeroApartamento;
      this.email = email;
      this.telefone = telefone;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
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

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public Morador toMorador(){
      return new Morador(cpf, name, email, numeroApartamento, telefone);
   }
   
}
