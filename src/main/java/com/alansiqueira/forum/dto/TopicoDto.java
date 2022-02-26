package com.alansiqueira.forum.dto;

import com.alansiqueira.forum.model.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {

    // id, titulo, mensagem, datacriacao
    private final Long id;
    private final String titulo;
    private final String mensagem;
    private final LocalDateTime dataCriacao;

    public TopicoDto (Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }




    public static List<TopicoDto> converter (List<Topico> topicos) {

        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
