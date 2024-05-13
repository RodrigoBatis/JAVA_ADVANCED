package br.com.fiap.Aula08revisao.repository;

import br.com.fiap.Aula08revisao.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
