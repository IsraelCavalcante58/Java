package br.com.restapi.projetofullstack.controller;

import br.com.restapi.projetofullstack.Exception.IdNotFound;
import br.com.restapi.projetofullstack.model.Usuario;
import br.com.restapi.projetofullstack.repository.UsuarioRepository;
import br.com.restapi.projetofullstack.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioService usuarioService, UsuarioRepository usuarioRepository) {
        this.usuarioService = usuarioService;
        this.usuarioRepository = usuarioRepository;
    }


    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/criar")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.criarUsuario(usuario);
    }

    @PutMapping("/editar")
    public ResponseEntity<String> editarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.editarUsuario(usuario);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluirUsuario(@PathVariable Integer id) {
        return usuarioService.excluirUsuario(id);
    }
}
