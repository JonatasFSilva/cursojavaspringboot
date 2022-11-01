package com.example.metaum.cursojavaspringboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	// MUITOS ALUNOS PARA UM CURSO
	@ManyToOne
	private Curso curso;

	// GETTERS E SETTERS CRIADOS AUTOMATICAMENTE PELO LOMBOK COM O @Data

}
