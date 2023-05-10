package com.copyfan.apicopyfan.service;

import com.copyfan.apicopyfan.model.Produto;
import com.copyfan.apicopyfan.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public List<Produto> buscarTodos() {
        List<Produto> response = produtoRepository.findAll();
        return response;
    }
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public Produto atualizar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}