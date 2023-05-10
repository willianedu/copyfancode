package com.copyfan.apicopyfan.repository;



import com.copyfan.apicopyfan.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByIdAndAtivo(String nome, Boolean status);
}
