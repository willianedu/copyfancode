package com.copyfan.apicopyfan.controller;

import com.copyfan.apicopyfan.model.Professor;
import com.copyfan.apicopyfan.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;
    @PostMapping
    public ResponseEntity<Professor> salvarProfessor(@RequestBody Professor professor) {
        Professor response = professorService.salvar(professor);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Professor>> buscarTodos() {
        List<Professor> response = professorService.buscarTodos();
        return ResponseEntity.ok(response);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Professor> buscarPorId(@PathVariable Long id) {
        Optional<Professor> response = professorService.buscarPorId(id);
        if(response.isPresent()) {
            return ResponseEntity.ok(response.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<Professor> update(@RequestBody Professor professor) {
        if(!professorService.buscarPorId(professor.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(professorService.atualizar(professor));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!professorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        professorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}