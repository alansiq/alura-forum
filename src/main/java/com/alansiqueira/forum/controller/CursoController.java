package com.alansiqueira.forum.controller;

import com.alansiqueira.forum.dto.CursoDto;
import com.alansiqueira.forum.model.Curso;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
public class CursoController {

    @RequestMapping("/cursos")
    public List<CursoDto> cursos() {

        Curso curso = new Curso("Nome do curso", "categoria do curso");
        System.out.println("Hit cursos endpoint");

        return CursoDto.converter(Arrays.asList(curso, curso, curso));
    }
}
