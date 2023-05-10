package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.Produto;
import com.copyfan.apicopyfan.model.Usuario;

import com.copyfan.apicopyfan.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarTodos() {
        List<Usuario> response = usuarioRepository.findAll();
        return response;
    }
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }
    public Usuario atualizar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public void deleteById(Long id) {usuarioRepository.deleteById(id);
    }
}
