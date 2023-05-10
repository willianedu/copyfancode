package com.copyfan.apicopyfan.repository;

import com.copyfan.apicopyfan.model.CarrinhoDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarrinhoDeComprasRepository extends JpaRepository<CarrinhoDeCompras, Long> {
    CarrinhoDeCompras findByIdAndAtivo(String nome, Boolean status);

}
