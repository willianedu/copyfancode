package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.Administrador;
import com.copyfan.apicopyfan.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {

    @Autowired
    AdministradorRepository administradorRepository;

    public Administrador salvar(Administrador administrador) {
        return administradorRepository.save(administrador);
    }
    public List<Administrador> buscarTodos() {
        List<Administrador> response = administradorRepository.findAll();
        return response;
    }
    public Optional<Administrador> buscarPorId(Long id) {
        return administradorRepository.findById(id);
    }
    public Administrador atualizar(Administrador administrador) {
        return administradorRepository.save(administrador);
    }
    public void deleteById(Long id) {
        administradorRepository.deleteById(id);
    }
}