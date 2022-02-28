package com.alansiqueira.forum.controller;

import com.alansiqueira.forum.dto.CursoDto;
import com.alansiqueira.forum.model.Curso;
import com.alansiqueira.forum.repository.CursoRepository;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @RequestMapping("/cursos")
    public List<CursoDto> cursos() {
        List<Curso> cursos = cursoRepository.findAll();
        return CursoDto.converter(cursos);
    }
}
