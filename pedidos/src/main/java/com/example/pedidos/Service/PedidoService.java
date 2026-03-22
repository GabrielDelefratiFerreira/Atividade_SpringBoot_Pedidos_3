package com.example.pedidos.Service;

import com.example.pedidos.Model.PedidoModel;
import com.example.pedidos.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoModel> findAll(){
        return pedidoRepository.findAll();
    }

    public PedidoModel criarProduto(PedidoModel pedido){
        return pedidoRepository.save(pedido);
    }

    public Optional<PedidoModel> buscarPorId(Long id){
        return pedidoRepository.findById(id);
    }

    public void deletarPedido(Long id){
        pedidoRepository.deleteById(id);
    }
}