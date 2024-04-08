package br.com.fiap.main.controller;

import br.com.fiap.main.service.PrecoInvalidoException;
import br.com.fiap.main.service.QuantidadeinvalidaException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PedidoExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> tratarGeral(Exception e){
        System.out.println("excecao do geral: " + e.getMessage());
        return ResponseEntity.status(400).body("Você fez alguma coisa errada");
    }
    @ExceptionHandler(QuantidadeinvalidaException.class)
    public ResponseEntity<String> tratarQuantidadeInvalida(Exception e){
        System.out.println("excecao do tratarQuantidadeInvalida: " + e.getMessage());
        return ResponseEntity.status(400).body("Você digitou a quantidade invalida");
    }
    @ExceptionHandler(PrecoInvalidoException.class)
    public ResponseEntity<String> tratarPrecoInvalida(Exception e){
        System.out.println("excecao do PrecoInvalidaException: " + e.getMessage());
        return ResponseEntity.status(400).body("Você digitou o preço invalido");
    }

}
