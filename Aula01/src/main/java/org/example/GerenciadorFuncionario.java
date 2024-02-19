package org.example;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorFuncionario {

    private Set<Funciorio> funciorios = new HashSet<>();

    public String adicionarFuncionario(Funciorio funciorio){
        funciorios.add(funciorio);
        return "Funcionario adicionado com Sucesso!!!";
    }

    public String removerFucionario(Funciorio funciorio){
        funciorios.remove(funciorio);
        return "Funcionario removido com sucesso!!!";
    }

    public void listarFuncionarios(){
        funciorios.forEach(funciorio -> {
            System.out.println(funciorio.toString());
        });
    }


}
