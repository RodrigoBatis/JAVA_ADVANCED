package br.com.fiap.main.service;

public class PrecoInvalidoException extends RuntimeException{
    public PrecoInvalidoException(String precoNaoPodeSerZero){
        super(precoNaoPodeSerZero);
    }
}
