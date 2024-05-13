package br.com.fiap.Aula08revisao.controller;

import br.com.fiap.Aula08revisao.model.Carro;
import br.com.fiap.Aula08revisao.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carro")
public class DemoController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public ResponseEntity<Carro> cadastrarCarro(@RequestBody Carro carro){
        return ResponseEntity.ok(carroService.cadastrarCarro(carro));
    }

    @GetMapping
    public ResponseEntity<List<Carro>> listarCarros(){
        return ResponseEntity.ok(carroService.buscarTodosCarros());
    }

}
