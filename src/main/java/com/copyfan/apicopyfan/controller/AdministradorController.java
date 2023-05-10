package com.copyfan.apicopyfan.controller;

import com.copyfan.apicopyfan.model.Administrador;
import com.copyfan.apicopyfan.model.Produto;
import com.copyfan.apicopyfan.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    AdministradorService administradorService;
    @PostMapping
    public ResponseEntity<Administrador> salvarAdministrador(@RequestBody Administrador administrador) {
        Administrador response = administradorService.salvar(administrador);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Administrador>> buscarTodos() {
        List<Administrador> response = administradorService.buscarTodos();
        return ResponseEntity.ok(response);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Administrador> buscarPorId(@PathVariable Long id) {
        Optional<Administrador> response = administradorService.buscarPorId(id);
        if(response.isPresent()) {
            return ResponseEntity.ok(response.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<Administrador> update(@RequestBody Administrador administrador) {
        if(!administradorService.buscarPorId(administrador.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(administradorService.atualizar(administrador));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!administradorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        administradorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
