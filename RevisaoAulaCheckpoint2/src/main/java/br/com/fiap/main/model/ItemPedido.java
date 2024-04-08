package br.com.fiap.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {

    @Id @GeneratedValue
    private Long id;

    private BigDecimal preco;

    private String nome;

    private String descricao;

    private Integer quantidade;
}
