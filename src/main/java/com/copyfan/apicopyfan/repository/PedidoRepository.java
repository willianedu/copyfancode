package com.copyfan.apicopyfan.repository;


import com.copyfan.apicopyfan.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    Pedido findByIdAndAtivo(Long id, Boolean status);
}
