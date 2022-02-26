package com.alansiqueira.forum.controller;

import com.alansiqueira.forum.dto.CursoDto;
import com.alansiqueira.forum.model.Curso;
import com.alansiqueira.forum.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CursoController {

    private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @RequestMapping("/cursos")
    public List<CursoDto> cursos(String nomeCurso) {
        try {
            if (nomeCurso == null || nomeCurso.isBlank()) {
                List<Curso> cursos = cursoRepository.findAll();
                return CursoDto.converter(cursos);
            } else {
                List<Curso> cursos = cursoRepository.findByNome(nomeCurso);
                return CursoDto.converter(cursos);
            }

        } catch(Error e) {
            return null;
        }
    }
}
