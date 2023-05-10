package com.copyfan.apicopyfan.controller;


import com.copyfan.apicopyfan.model.Aluno;

import com.copyfan.apicopyfan.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")

public class AlunoController {

    @Autowired
    AlunoService alunoService;
    @PostMapping
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno) {
        Aluno response = alunoService.salvar(aluno);
        return ResponseEntity.ok(aluno);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Aluno>> buscarTodos() {
        List<Aluno> response = alunoService.buscarTodos();
        return ResponseEntity.ok(response);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoService.buscarPorId(id);
        if(aluno.isPresent()) {
            return ResponseEntity.ok(aluno.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {
        if(!alunoService.buscarPorId(aluno.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alunoService.atualizar(aluno));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!alunoService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        alunoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
