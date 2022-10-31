package com.example.metaum.cursojavaspringboot.repositorires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.metaum.cursojavaspringboot.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
	

}
