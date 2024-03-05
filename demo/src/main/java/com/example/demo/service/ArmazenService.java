package com.example.demo.service;

import com.example.demo.repository.ArmazenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmazenService {
    @Autowired
    private ArmazenRepository armazenRepository;

}
