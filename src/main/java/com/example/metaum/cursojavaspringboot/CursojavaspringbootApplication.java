package com.example.metaum.cursojavaspringboot;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.metaum.cursojavaspringboot.entities.Aluno;
import com.example.metaum.cursojavaspringboot.entities.Curso;
import com.example.metaum.cursojavaspringboot.entities.GradeCurricular;
import com.example.metaum.cursojavaspringboot.repositorires.AlunoRepository;
import com.example.metaum.cursojavaspringboot.repositorires.CursoRepository;
import com.example.metaum.cursojavaspringboot.repositorires.GradeCurricularRepository;

@SpringBootApplication
public class CursojavaspringbootApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private GradeCurricularRepository gradeCurricularRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursojavaspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Curso curso1 = new Curso("Graduação em Ti", "Exatas");
		Curso curso2 = new Curso("Graduação em Economia", "Humanas");
		Curso curso3 = new Curso("Graduacao em Administracao", "Humanas");
		Curso curso4 = new Curso("Graduacao em Educação Fisica", "Humanas");
		Curso curso5 = new Curso("Graduacao em Educação Continuada", "Humanas");
		Curso curso6 = new Curso("Graduacao em Fisica", "Exatas");

		// INSERT OR *UPDATE (SOMENTE SE FOR UM OBJETO INSTANCIADO?)
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
		cursoRepository.save(curso5);
		cursoRepository.save(curso6);

		Aluno aluno1 = new Aluno("Jose", curso1);
		Aluno aluno2 = new Aluno("Aline", curso1);
		Aluno aluno3 = new Aluno("Humberto", curso4);

		alunoRepository.save(aluno1);
		alunoRepository.save(aluno2);
		alunoRepository.save(aluno3);

		GradeCurricular gradeCurricular1 = new GradeCurricular("Graduacao em Games", aluno1);
		GradeCurricular gradeCurricular2 = new GradeCurricular("Graduacao em Fisica", aluno2);
		GradeCurricular gradeCurricular3 = new GradeCurricular("Graduacao em Academia de Rua", aluno3);

		gradeCurricularRepository.save(gradeCurricular1);
		gradeCurricularRepository.save(gradeCurricular2);
		gradeCurricularRepository.save(gradeCurricular3);

	}
}
