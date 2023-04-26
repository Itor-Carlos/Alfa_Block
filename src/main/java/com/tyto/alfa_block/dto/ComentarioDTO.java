package com.tyto.alfa_block.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

public class ComentarioDTO {
   
   @NotBlank(message = "O id do comentario não pode ser nulo ou vazio.")
   private Long id;

   @NotBlank(message = "O conteudo do comentario não pode ser nulo ou vazio.")
   @Length(min = 1, max = 30)
   private String conteudoComentario;

   @NotBlank(message = "O id do topico ao qual esse comentario foi atribuido não pode ser nulo ou vazio")
   private Long idTopico;
   
   @NotBlank(message = "O campo cpf do morador que criou o comentario não pode ser nulo.")
   @Length(min = 11,max = 11, message = "O campo cpf deve conter 11 caracteres")
   private String cpfMoradorCriador;

   public ComentarioDTO() {}

   public ComentarioDTO(Long id, String conteudoComentario, Long idTopico, String cpfMoradorCriador) {
      this.id = id;
      this.conteudoComentario = conteudoComentario;
      this.idTopico = idTopico;
      this.cpfMoradorCriador = cpfMoradorCriador;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getConteudoComentario() {
      return conteudoComentario;
   }

   public void setConteudoComentario(String conteudoComentario) {
      this.conteudoComentario = conteudoComentario;
   }

   public Long getIdTopico() {
      return idTopico;
   }

   public void setIdTopico(Long idTopico) {
      this.idTopico = idTopico;
   }

   public String getCpfMoradorCriador() {
      return cpfMoradorCriador;
   }

   public void setCpfMoradorCriador(String cpfMoradorCriador) {
      this.cpfMoradorCriador = cpfMoradorCriador;
   }

   

}
