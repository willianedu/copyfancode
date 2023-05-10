package com.copyfan.apicopyfan.service;
import com.copyfan.apicopyfan.model.Aluno;
import com.copyfan.apicopyfan.model.Usuario;
import com.copyfan.apicopyfan.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;


    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }


    public List<Aluno> buscarTodos() {
        List<Aluno> response = alunoRepository.findAll();
        return response;

    }

    public Optional<Aluno> buscarPorId(Long id) {

        return alunoRepository.findById(id);
    }

    public Aluno atualizar(Aluno aluno) {

        return alunoRepository.save(aluno);
    }

    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }
}
