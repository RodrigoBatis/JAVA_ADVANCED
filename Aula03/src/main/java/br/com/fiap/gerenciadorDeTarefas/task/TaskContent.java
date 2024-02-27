package br.com.fiap.gerenciadorDeTarefas.task;

import lombok.Data;

@Data
public class TaskContent {

    private Long id;
    private String title;
    private TaskStatus status;



}
