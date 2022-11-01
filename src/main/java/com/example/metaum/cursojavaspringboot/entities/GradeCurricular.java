package com.example.metaum.cursojavaspringboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "grade")
@NoArgsConstructor
public class GradeCurricular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = true)
	private String objetivo;

	// UMA GRADE PRA UM ALUNO, USANDO O ID DO ALUNO COMO CHAVE ESTRANGEIRA
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aluno_id", referencedColumnName = "id")
	private Aluno aluno;

	public GradeCurricular(String objetivo, Aluno aluno) {
		super();
		this.objetivo = objetivo;
		this.aluno = aluno;
	}
	
	

}
