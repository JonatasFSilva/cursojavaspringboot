package com.example.metaum.cursojavaspringboot;

import java.util.List;

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

		Curso curso1 = new Curso("Graduacao em Ti");
		Curso curso2 = new Curso("Graduacao em Economia");

		//INSERT OR *UPDATE
		repository.save(curso1);
		repository.save(curso2);

		List<Curso> listaDeCursos = repository.findAll();
		
		listaDeCursos.forEach(curso -> System.out.println(curso));
		
		System.out.println("Total de Cursos: " + repository.count());
		
		curso2.setNome("Graduacao em Administracao");
		repository.save(curso2);
		
		listaDeCursos = repository.findAll();		
		listaDeCursos.forEach(curso -> System.out.println(curso));
	}

}
