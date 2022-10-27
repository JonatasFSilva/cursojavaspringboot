package com.example.metaum.cursojavaspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursojavaspringbootApplication implements CommandLineRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(CursojavaspringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CursojavaspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iniciando o RUN...");
		
		Curso c = new Curso();
		
		c.mostradados();
		
		LOG.info("Finalizando o RUN");
		
	}

}
