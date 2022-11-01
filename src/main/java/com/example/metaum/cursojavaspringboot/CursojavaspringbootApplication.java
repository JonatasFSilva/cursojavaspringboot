package com.example.metaum.cursojavaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.metaum.cursojavaspringboot.entities.Aluno;
import com.example.metaum.cursojavaspringboot.entities.Curso;
import com.example.metaum.cursojavaspringboot.repositorires.AlunoRepository;
import com.example.metaum.cursojavaspringboot.repositorires.CursoRepository;

@SpringBootApplication
public class CursojavaspringbootApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private AlunoRepository alunoRepository;

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

		alunoRepository.save(aluno1);
		alunoRepository.save(aluno2);

		/*
		 * System.out.println("Aguardando 3 segundos..."); Thread.sleep(3000);
		 * 
		 * curso6.setNome("Graduacao em Fisica - Alterada"); repository.save(curso6);
		 * 
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
		 * 
		 * List<Curso> cursoPorNomeLike = repository.findCursoByNomeLike("%Educação%");
		 * cursoPorNomeLike.forEach(curso -> System.out.println(curso));
		 * 
		 * List<Curso> cursoPorNomeLikeIgnoreCase =
		 * repository.findCursoByNomeLikeIgnoreCase("%Educação%");
		 * cursoPorNomeLikeIgnoreCase.forEach(curso -> System.out.println(curso));
		 * 
		 * List<Curso> cursoPorQuery = repository.findByQueryNome();
		 * cursoPorQuery.forEach(System.out::println);
		 * 
		 * List<String> cursoPorQueryNativa = repository.findByQueryNomePorArea();
		 * cursoPorQueryNativa.forEach(curso -> System.out.println(curso));
		 * 
		 * List<String> cursoPorQueryNativaPassandoArea =
		 * repository.findByQueryNomePorAreaInformada("Humanas");
		 * cursoPorQueryNativaPassandoArea.forEach(curso -> System.out.println(curso));
		 * 
		 * List<String> cursoPorQueryNativaPassandoAreaCurso =
		 * repository.findByQueryNomePorAreaInformadaCurso(
		 * "Humanas","Graduacao em Administracao");
		 * cursoPorQueryNativaPassandoAreaCurso.forEach(curso ->
		 * System.out.println(curso));
		 * 
		 * List<String> cursoPorQueryParamentro =
		 * repository.findByQueryPorParamentros("Exatas", "Graduação em Ti");
		 * cursoPorQueryParamentro.forEach(curso -> System.out.println(curso));
		 */
	}
}
