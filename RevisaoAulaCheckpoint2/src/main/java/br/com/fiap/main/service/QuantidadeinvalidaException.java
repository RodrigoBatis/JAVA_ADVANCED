package br.com.fiap.main.service;

public class QuantidadeinvalidaException extends RuntimeException {
    public QuantidadeinvalidaException(String quantidade) {
        super(quantidade);
    }
}
