package com.restapi.repository;

import com.restapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long> {
    public Optional<UsuarioModel> findByLogin(String login);
}
