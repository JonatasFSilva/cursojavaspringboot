package com.example.metaum.cursojavaspringboot.repositorires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.metaum.cursojavaspringboot.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

	List<Curso> findCursoByNome(String nome);

	List<Curso> findCursoByNomeContaining(String valor);

	List<Curso> findCursoByNomeLike(String valor);

	List<Curso> findCursoByNomeLikeIgnoreCase(String valor);

	@Query(value = "Select c From Curso c")
	List<Curso> findByQueryNome();

	@Query(value = "Select nome_do_curso From Curso where area = 'Exatas'", nativeQuery = true)
	List<String> findByQueryNomePorArea();

	@Query(value = "Select nome_do_curso From Curso where area = :area", nativeQuery = true)
	List<String> findByQueryNomePorAreaInformada(@Param("area") String area);

}
