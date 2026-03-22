package com.example.pedidos.Controller;

import com.example.pedidos.Model.PedidoModel;
import com.example.pedidos.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoModel> findAll(){
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PedidoModel> buscarPorId(@PathVariable Long id){
        return pedidoService.buscarPorId(id);
    }

    @PostMapping
    public PedidoModel criarProduto(@RequestBody PedidoModel pedido){
        return pedidoService.criarProduto(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        pedidoService.deletarPedido(id);
    }
}