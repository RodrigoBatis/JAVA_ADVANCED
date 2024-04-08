package br.com.fiap.main.controller;

import br.com.fiap.main.model.Pedido;
import br.com.fiap.main.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    private PedidoService service;

    @Autowired
    public PedidoController(PedidoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido){
        Pedido pedidoSalvo = service.criarPedido(pedido);
        return ResponseEntity.ok(pedidoSalvo);
    }
}
