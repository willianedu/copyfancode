package com.copyfan.apicopyfan.repository;
import com.copyfan.apicopyfan.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno findByIdAndAtivo(String nome, Boolean status);

}