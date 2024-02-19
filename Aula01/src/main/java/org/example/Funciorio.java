package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Funciorio {

    private Long id;
    private String nome;
    private BigDecimal salario;

    public Funciorio(Long id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funciorio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funciorio funciorio = (Funciorio) o;
        return Objects.equals(id, funciorio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
