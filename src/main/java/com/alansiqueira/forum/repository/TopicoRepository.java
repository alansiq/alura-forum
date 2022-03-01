package com.alansiqueira.forum.repository;

import com.alansiqueira.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCursoNome(String nomeCurso);

    List<Topico> findByTitulo(String titulo);
}
