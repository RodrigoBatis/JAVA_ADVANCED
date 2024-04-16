package br.com.fiap.Security.repository;

import br.com.fiap.Security.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
