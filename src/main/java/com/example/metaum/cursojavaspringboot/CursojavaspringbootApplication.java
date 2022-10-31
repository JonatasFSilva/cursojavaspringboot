package com.example.metaum.cursojavaspringboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.metaum.cursojavaspringboot.entities.Curso;
import com.example.metaum.cursojavaspringboot.repositorires.CursoRepository;

@SpringBootApplication
public class CursojavaspringbootApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CursojavaspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Curso curso1 = new Curso("Graduação em Ti");
		Curso curso2 = new Curso("Graduação em Economia");
		Curso curso3 = new Curso("Graduacao em Administracao");
		Curso curso4 = new Curso("Graduacao em Educação Fisica");
		Curso curso5 = new Curso("Graduacao em Educação Continuada");
		Curso curso6 = new Curso("Graduacao em educação Alternativa");

		// INSERT OR *UPDATE (SOMENTE SE FOR UM OBJETO INSTANCIADO?)
		repository.save(curso1);
		repository.save(curso2);
		repository.save(curso3);
		repository.save(curso4);
		repository.save(curso5);
		repository.save(curso6);

		/*
		 * List<Curso> listaDeCursos = repository.findAll();
		 * 
		 * listaDeCursos.forEach(curso -> System.out.println(curso));
		 * 
		 * System.out.println("Total de Cursos: " + repository.count());
		 * 
		 * curso2.setNome("Graduacao em Administracao"); repository.save(curso2);
		 * 
		 * listaDeCursos = repository.findAll(); listaDeCursos.forEach(curso ->
		 * System.out.println(curso));
		 * 
		 * DELETE OBJETCT OR DELETE BY ID repository.delete(curso1);
		 * repository.deleteById(2);
		 * 
		 * listaDeCursos = repository.findAll(); listaDeCursos.forEach(c ->
		 * System.out.println(c));
		 * 
		 * System.out.println("Total de Cursos: " + repository.count());
		 * 
		 * Optional<Curso> cursoProcurado = repository.findById(3); Curso cursoFinal =
		 * cursoProcurado.orElse(null); System.out.println("O nome do Curso buscado e: "
		 * + cursoFinal.getNome());
		 * 
		 * 
		 * // FIND BY NAME List<Curso> cursosPorNome =
		 * repository.findCursoByNome("Graduacao em Administracao");
		 * cursosPorNome.forEach(curso -> System.out.println(curso));
		 * 
		 * // FIND BY CONTAINING (IGUAL AO LIKE %___%) List<Curso> cursosPorNomeContendo
		 * = repository.findCursoByNomeContaining("Graduacao");
		 * cursosPorNomeContendo.forEach(curso -> System.out.println(curso));
		 * 
		 * // FIND BY LIKE (USAR O % PARA DEFINIR O QUE SERA PESQUISADO E/OU POR ONDE
		 * DEVE // COMECAR A CONSIDERAR A BUSCA // COMECANDO POR (___%) // TERMINANDO
		 * COM (%___) // QUE TENHA (%___%) List<Curso> cursosPorNomeQueTenha =
		 * repository.findCursoByNomeLike("%Graduacao%");
		 * cursosPorNomeQueTenha.forEach(curso -> System.out.println(curso));
		 */
		
		List<Curso> cursoPorNomeLike = repository.findCursoByNomeLike("%Educação%");
		cursoPorNomeLike.forEach(curso -> System.out.println(curso));
		
		List<Curso> cursoPorNomeLikeIgnoreCase = repository.findCursoByNomeLikeIgnoreCase("%Educação%");
		cursoPorNomeLikeIgnoreCase.forEach(curso -> System.out.println(curso));
	}
}
