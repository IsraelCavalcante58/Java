package br.com.restapi.projetofullstack.repository;

import br.com.restapi.projetofullstack.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
