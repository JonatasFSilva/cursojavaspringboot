package com.example.metaum.cursojavaspringboot.repositorires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.metaum.cursojavaspringboot.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
	List<Curso> findCursoByNome(String nome);
	
	List<Curso> findCursoByNomeContaining(String valor);
	
	List<Curso> findCursoByNomeLike(String valor);
	
	List<Curso> findCursoByNomeLikeIgnoreCase(String valor);

}
