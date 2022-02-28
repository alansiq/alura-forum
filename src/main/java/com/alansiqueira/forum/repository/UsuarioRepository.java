package com.alansiqueira.forum.repository;

import com.alansiqueira.forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
