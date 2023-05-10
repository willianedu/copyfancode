package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.Cliente;
import com.copyfan.apicopyfan.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public List<Cliente> buscarTodos() {
        List<Cliente> response = clienteRepository.findAll();
        return response;
    }
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
    public Cliente atualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}