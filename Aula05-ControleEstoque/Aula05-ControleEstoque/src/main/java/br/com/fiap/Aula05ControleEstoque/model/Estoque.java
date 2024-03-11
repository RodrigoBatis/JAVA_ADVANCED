package br.com.fiap.Aula05ControleEstoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Estoque {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotEmpty
    private String nomeDoProduto;
    @NotNull
    @NotEmpty
    private Integer quantidade;
    @NotNull
    @NotEmpty
    private String localizacaoArmazem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocalizacaoArmazem() {
        return localizacaoArmazem;
    }

    public void setLocalizacaoArmazem(String localizacaoArmazem) {
        this.localizacaoArmazem = localizacaoArmazem;
    }
}
