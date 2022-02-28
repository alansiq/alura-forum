package com.alansiqueira.forum.dto;

import com.alansiqueira.forum.model.Usuario;

public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;

    public UsuarioDto (Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
