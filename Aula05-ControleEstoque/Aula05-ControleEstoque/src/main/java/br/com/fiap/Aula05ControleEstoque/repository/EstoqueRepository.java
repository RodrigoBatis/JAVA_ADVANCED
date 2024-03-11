package br.com.fiap.Aula05ControleEstoque.repository;

import br.com.fiap.Aula05ControleEstoque.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {


    void atualizarEstoque(Estoque estoque);
}
