package com.copyfan.apicopyfan.controller;

import com.copyfan.apicopyfan.model.Pedido;
import com.copyfan.apicopyfan.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> salvarPedido(@RequestBody Pedido pedido) {
        Pedido response = pedidoService.salvar(pedido);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Pedido>> buscarTodos() {
        List<Pedido> response = pedidoService.buscarTodos();
        return ResponseEntity.ok(response);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        Optional<Pedido> response = pedidoService.buscarPorId(id);
        if(response.isPresent()) {
            return ResponseEntity.ok(response.get());
        }
        return ResponseEntity.notFound().build();

    }
    @PutMapping()
    public ResponseEntity<Pedido> update(@RequestBody Pedido pedido) {
        if(!pedidoService.buscarPorId(pedido.getId()).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidoService.atualizar(pedido));
    }
    @GetMapping(path = "/numero/{numeroPedido}")
    public ResponseEntity<Pedido> buscarPorNumeroPedido(@PathVariable Long id) {
        Pedido response = pedidoService.buscarPorIdAndAtivo(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!pedidoService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
       pedidoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
