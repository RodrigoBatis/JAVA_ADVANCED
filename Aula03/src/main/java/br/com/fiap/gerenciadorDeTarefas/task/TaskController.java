package br.com.fiap.gerenciadorDeTarefas.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){this.taskService = taskService;}

    @GetMapping
    public ResponseEntity<List<TaskContent>> getAllTasks() {
        return ResponseEntity.ok(taskService.listTasks());
    }

}
