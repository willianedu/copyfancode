package com.copyfan.apicopyfan.controller;

import com.copyfan.apicopyfan.model.CarrinhoDeCompras;
import com.copyfan.apicopyfan.service.CarrinhoDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrinhoDeCompras")

public class CarrinhoDeComprasController {

    @Autowired
    CarrinhoDeComprasService carrinhodecomprasService;
    @PostMapping
    public ResponseEntity<CarrinhoDeCompras> salvarCarinhoDeCompra(@RequestBody CarrinhoDeCompras carrinhodecompras) {
        CarrinhoDeCompras response = carrinhodecomprasService.salvar(carrinhodecompras);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<CarrinhoDeCompras>> buscarTodos() {
        List<CarrinhoDeCompras> response = carrinhodecomprasService.buscarTodos();
        return ResponseEntity.ok(response);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<CarrinhoDeCompras> buscarPorId(@PathVariable Long id) {
        Optional<CarrinhoDeCompras>carrinhoDeCompras= carrinhodecomprasService.buscarPorId(id);
        if(carrinhoDeCompras.isPresent()) {
            return ResponseEntity.ok(carrinhoDeCompras.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<CarrinhoDeCompras> update(@RequestBody CarrinhoDeCompras carrinhodecompras) {
        if(!carrinhodecomprasService.buscarPorId(carrinhodecompras.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carrinhodecomprasService.atualizar(carrinhodecompras));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!carrinhodecomprasService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        carrinhodecomprasService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

