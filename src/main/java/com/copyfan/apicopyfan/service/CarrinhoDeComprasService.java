package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.CarrinhoDeCompras;
import com.copyfan.apicopyfan.model.Usuario;
import com.copyfan.apicopyfan.repository.CarrinhoDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarrinhoDeComprasService {
    @Autowired

    CarrinhoDeComprasRepository carrinhodecomprasRepository;


    public CarrinhoDeCompras salvar(CarrinhoDeCompras carrinhodecompras) {
        return carrinhodecomprasRepository.save(carrinhodecompras);
    }


    public List<CarrinhoDeCompras> buscarTodos() {
        List<CarrinhoDeCompras> response = carrinhodecomprasRepository.findAll();
        return response;

    }


    public Optional<CarrinhoDeCompras> buscarPorId(Long id) {

        return carrinhodecomprasRepository.findById(id);
    }

    public CarrinhoDeCompras atualizar(CarrinhoDeCompras carrinhoDeCompras) {
        return carrinhodecomprasRepository.save(carrinhoDeCompras);
    }

    public void deleteById(Long id) {
        carrinhodecomprasRepository.deleteById(id);
    }
}


