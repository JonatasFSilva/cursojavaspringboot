package com.example.metaum.cursojavaspringboot.repositorires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.metaum.cursojavaspringboot.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
