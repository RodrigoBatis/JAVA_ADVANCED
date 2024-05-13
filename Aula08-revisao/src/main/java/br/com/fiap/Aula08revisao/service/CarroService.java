package br.com.fiap.Aula08revisao.service;

import br.com.fiap.Aula08revisao.model.Carro;
import br.com.fiap.Aula08revisao.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro){
        return carroRepository.save(carro);
    }

    public List<Carro> buscarTodosCarros(){
        return carroRepository.findAll();
    }

}
