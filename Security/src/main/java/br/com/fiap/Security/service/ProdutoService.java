package br.com.fiap.Security.service;

import br.com.fiap.Security.model.Produto;
import br.com.fiap.Security.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto criarProduto(Produto produto){
        return repository.save(produto);
    }

    public List<Produto> buscarTodosProdutos(){
        return repository.findAll();
    }
}