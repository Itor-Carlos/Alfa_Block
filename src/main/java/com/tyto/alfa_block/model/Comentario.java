package com.tyto.alfa_block.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comentario {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer id;

   @Column(length = 30, nullable = false)
   private String conteudoComentario;

   @ManyToOne
   @JoinColumn(name = "topico_id", referencedColumnName = "id")
   private Topico topicoId;

   @ManyToOne
   @JoinColumn(name = "cpf_morador", referencedColumnName = "cpf")
   private Morador cpfMoradorCriador;

   public Comentario(){}

   public Comentario(Integer id, String conteudoComentario, Topico topicoId) {
      this.id = id;
      this.conteudoComentario = conteudoComentario;
      this.topicoId = topicoId;
   }

   public Comentario(Integer id, String conteudoComentario, Topico topicoId, Morador cpfMoradorCriador) {
      this.id = id;
      this.conteudoComentario = conteudoComentario;
      this.topicoId = topicoId;
      this.cpfMoradorCriador = cpfMoradorCriador;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getConteudoComentario() {
      return conteudoComentario;
   }

   public void setConteudoComentario(String conteudoComentario) {
      this.conteudoComentario = conteudoComentario;
   }

   public Topico getTopicoId() {
      return topicoId;
   }

   public void setTopicoId(Topico topicoId) {
      this.topicoId = topicoId;
   }

   public Morador getCpfMoradorCriador() {
      return cpfMoradorCriador;
   }
}