package br.com.restapi.projetofullstack.services;

import br.com.restapi.projetofullstack.Exception.IdNotFound;
import br.com.restapi.projetofullstack.model.Usuario;
import br.com.restapi.projetofullstack.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> listaUsuarios = usuarioRepository.findAll();
        return ResponseEntity.status(200).body(listaUsuarios);
    }

    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = usuarioRepository.save(usuario);
        return ResponseEntity.status(201).body(usuarioNovo);
    }

    public ResponseEntity<String> editarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioEditado = usuario;
        if (usuarioEditado != null && usuarioRepository.existsById(usuario.getId())) {
            Usuario usuarioNovo = usuarioRepository.save(usuario);
            return ResponseEntity.status(200).body("Usuário atualizado com sucesso");
        }
        return ResponseEntity.status(404).body("Usuário não encontrado.");
    }

    public ResponseEntity<String> excluirUsuario(@PathVariable Integer id) {
        try {
            usuarioRepository.deleteById(id);
            return ResponseEntity.status(204).body("Usuário excluído com sucesso.");
        } catch (EmptyResultDataAccessException e) {
            throw new IdNotFound("Não foi possível encontrar o usuário com o id: " + id);
        }
    }
}