package br.com.fiap.Aula05ControleEstoque.controller;

import br.com.fiap.Aula05ControleEstoque.model.Estoque;
import br.com.fiap.Aula05ControleEstoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping
    public ResponseEntity<Estoque> salvarEstoque(@RequestBody Estoque estoque){
        Estoque estoqueSalvo = estoqueService.salvarEstoque(estoque);
        return ResponseEntity.ok(estoqueSalvo);
    }

    @GetMapping
    public ResponseEntity<Page<Estoque>> listaTodosProdutosComPaginacao(
            @RequestParam(value = "page",defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size){
        Page<Estoque> estoque = estoqueService.buscaPaginacao(page, size);
        return  ResponseEntity.ok(estoque);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstoque(@PathVariable Long id){
        estoqueService.deletarEstoque(id);
        return ResponseEntity.ok().build();
    }

}
