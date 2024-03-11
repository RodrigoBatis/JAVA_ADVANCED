package br.com.fiap.Aula05ControleEstoque.service;

import br.com.fiap.Aula05ControleEstoque.model.Estoque;
import br.com.fiap.Aula05ControleEstoque.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Estoque salvarEstoque(Estoque estoque){

       return estoqueRepository.save(estoque);

    }

    public Page<Estoque> buscaPaginacao(int page, int size) {

        PageRequest pageRequest = PageRequest.of(page, size, Sort.unsorted());
        return estoqueRepository.findAll(pageRequest);

    }

    public void deletarEstoque(Long id) {
        estoqueRepository.deleteById(id);
    }
//    http://localhost:8080/estoque
    @PutMapping
    public void atualizarEstoque(Estoque estoque){
        Optional<Estoque> estoqueSalvo = estoqueRepository.findById(estoque.getId());
        estoqueRepository.save(estoqueSalvo);
    }

}
