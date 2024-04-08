package br.com.fiap.main.service;

import br.com.fiap.main.model.Pedido;
import br.com.fiap.main.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    @Autowired
    public PedidoService (PedidoRepository repository){
        this.repository = repository;
    }

    public Pedido criarPedido(Pedido pedido){
        validarPedido(pedido);
        return repository.save(pedido);
    }

    // Validação do Pedido
    private void validarPedido(Pedido pedido){
        if (pedido == null){
            throw new IllegalArgumentException("Pedido Nulo");
        }
        if(pedido.getQuantidade() <= 0) {
            throw  new QuantidadeinvalidaException("quantidade menor ou igual a zero");
        }
        if (pedido.getPrecoTotal().compareTo(BigDecimal.ZERO) <= 0){
            throw new PrecoInvalidoException("Preço não pode ser ZERO!!");
        }
    }
}
