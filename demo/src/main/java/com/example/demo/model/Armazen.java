package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Armazen {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Integer quantidade;
    private String localicao;

}
