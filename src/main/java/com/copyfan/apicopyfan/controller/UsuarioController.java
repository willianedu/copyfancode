package com.copyfan.apicopyfan.controller;

import com.copyfan.apicopyfan.model.Produto;
import com.copyfan.apicopyfan.model.Usuario;
import com.copyfan.apicopyfan.service.ProdutoService;
import com.copyfan.apicopyfan.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        Usuario response = usuarioService.salvar(usuario);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Usuario>> buscarTodos() {
        List<Usuario> response = usuarioService.buscarTodos();
        return ResponseEntity.ok(response);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        Optional<Usuario> response = usuarioService.buscarPorId(id);
        if(response.isPresent()) {
            return ResponseEntity.ok(response.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        if(!usuarioService.buscarPorId(usuario.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarioService.atualizar(usuario));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!usuarioService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

