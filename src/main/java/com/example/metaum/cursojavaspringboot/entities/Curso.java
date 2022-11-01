package com.example.metaum.cursojavaspringboot.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "curso")
@Data
@NoArgsConstructor
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome_do_curso", nullable = false)
	private String nome;

	@Column(nullable = false)
	private String area;

	@CreationTimestamp
	@Column(name = "data_de_criacao")
	private LocalDateTime datadeCriacao;

	@UpdateTimestamp
	@Column(name = "data_de_atualizacao")
	private LocalDateTime dataDeAtualizacao;

	public Curso(String nome, String area) {
		super();
		this.nome = nome;
		this.area = area;
	}

	// GETTERS E SETTERS CRIADOS AUTOMATICAMENTE PELO LOMBOK COM O @Data

}
