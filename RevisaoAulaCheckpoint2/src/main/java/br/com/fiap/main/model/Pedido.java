package br.com.fiap.main.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id @GeneratedValue
    private Long id;

    private Integer quantidade;

    private BigDecimal precoTotal;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemPedido> listaPedidos;
}
