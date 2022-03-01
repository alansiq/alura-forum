package com.alansiqueira.forum.controller;

import com.alansiqueira.forum.dto.TopicoDto;
import com.alansiqueira.forum.model.Topico;
import com.alansiqueira.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    public TopicoController(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    @RequestMapping("/topicos")
    public List<TopicoDto> getTopicos(String nomeCurso) {
        try {

            if(nomeCurso == null || nomeCurso.isBlank()) {
                List<Topico> topicos = topicoRepository.findAll();
                return TopicoDto.converter(topicos);
            }

            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDto.converter(topicos);

        } catch (Error e) {
            throw e;
        }

    }


}
