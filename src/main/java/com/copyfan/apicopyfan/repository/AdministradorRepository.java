package com.copyfan.apicopyfan.repository;

import com.copyfan.apicopyfan.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository  extends JpaRepository<Administrador, Long> {
}
