package com.alansiqueira.forum.repository;

import com.alansiqueira.forum.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNome(String nomeCurso);
}
