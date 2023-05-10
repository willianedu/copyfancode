package com.copyfan.apicopyfan.repository;



import com.copyfan.apicopyfan.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Professor findByIdAndAtivo(String nome, Boolean status);
}

