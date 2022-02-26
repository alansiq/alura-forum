package com.alansiqueira.forum.controller;

import com.alansiqueira.forum.dto.TopicoDto;
import com.alansiqueira.forum.model.Curso;
import com.alansiqueira.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Curso curso = new Curso("Javascript", "Programação");
        Topico topico = new Topico("Novo tópico", "Essa é a mensagem do nosso tópico, mudou!", curso);

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }


}
