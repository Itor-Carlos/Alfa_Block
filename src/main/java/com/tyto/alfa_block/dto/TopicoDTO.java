package com.tyto.alfa_block.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

public class TopicoDTO {
   
   @NotBlank(message = "O id do topico não pode ser nulo ou vazio.")
   private Long id;

   @NotBlank(message = "O titulo do topico não pode ser nulo ou vazio.")
   @Length(min = 3, max = 15)
   private String titulo;

   @NotBlank(message = "A descrição do topico não pode ser nula ou vazia.")
   @Length(min = 10, max = 30)
   private String descricao;

   @NotBlank(message = "O campo cpf do morador não pode ser nulo ou vazio.")
   @Length(min = 11,max = 11, message = "O campo cpf deve conter 11 caracteres")
   private String cpfMorador;

   public TopicoDTO() {
   }

   public TopicoDTO(Long id, String titulo, String descricao, String cpfMorador) {
      this.id = id;
      this.titulo = titulo;
      this.descricao = descricao;
      this.cpfMorador = cpfMorador;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getCpfMorador() {
      return cpfMorador;
   }

   public void setCpfMorador(String cpfMorador) {
      this.cpfMorador = cpfMorador;
   }
}
