package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario();
        Funciorio funciorioUm = new Funciorio(1L, "John", BigDecimal.valueOf(100.01));
        gerenciadorFuncionario.adicionarFuncionario(funciorioUm);
        Funciorio funciorioDpos = new Funciorio(2L, "Walter", BigDecimal.valueOf(100.01));
        gerenciadorFuncionario.adicionarFuncionario(funciorioDpos);
        gerenciadorFuncionario.listarFuncionarios();
    }
}