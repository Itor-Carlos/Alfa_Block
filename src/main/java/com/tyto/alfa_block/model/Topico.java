package com.tyto.alfa_block.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "topico")
public class Topico {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;

   @Column(length = 15, nullable = false)
   private String titulo;

   @Column(length = 30, nullable = false)
   private String descricao;

   @ManyToOne
   @JoinColumn(name = "cpf_morador", referencedColumnName = "cpf")
   private Morador cpfMorador;

   @OneToMany(mappedBy = "topicoId")
   private List<Comentario> comentarios = new ArrayList<>();

   public Topico(){}

   public Topico(Long id, String titulo, String descricao, Morador cpfMorador) {
      this.id = id;
      this.titulo = titulo;
      this.descricao = descricao;
      this.cpfMorador = cpfMorador;
   }

   public Topico(Long id, String titulo, String descricao, Morador cpfMorador, List<Comentario> comentarios) {
      this.id = id;
      this.titulo = titulo;
      this.descricao = descricao;
      this.cpfMorador = cpfMorador;
      this.comentarios = comentarios;
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

   public Morador getCpfMorador() {
      return cpfMorador;
   }
}