package com.example.metaum.cursojavaspringboot.repositorires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.metaum.cursojavaspringboot.entities.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
