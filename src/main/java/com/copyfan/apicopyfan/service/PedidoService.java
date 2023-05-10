package com.copyfan.apicopyfan.service;


import com.copyfan.apicopyfan.model.Pedido;
import com.copyfan.apicopyfan.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido salvar(Pedido pedido) {
        pedido.setAtivo(true);
        return pedidoRepository.save(pedido);
    }
    public List <Pedido> buscarTodos() {
        List<Pedido> response = pedidoRepository.findAll();

        response.removeIf(pedido -> !pedido.getAtivo());
        return response;
    }
    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }
    public Pedido atualizar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    public Pedido buscarPorIdAndAtivo(Long id) {
        return pedidoRepository.findByIdAndAtivo(id,true);
    }
    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
