package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.Professor;
import com.copyfan.apicopyfan.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;
    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }
    public List<Professor> buscarTodos() {
        List<Professor> response = professorRepository.findAll();
        return response;
    }
    public Optional<Professor> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }
    public Professor atualizar(Professor professor) {
        return professorRepository.save(professor);
    }
    public void deleteById(Long id) {professorRepository.deleteById(id);
    }
}
