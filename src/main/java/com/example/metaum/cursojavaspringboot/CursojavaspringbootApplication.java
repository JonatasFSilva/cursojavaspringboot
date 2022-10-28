package com.example.metaum.cursojavaspringboot;

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

		repository.save(curso1);
		repository.save(curso2);
	}

}
