package md.tekwill.todo.controller;


import md.tekwill.todo.entity.Task;
import md.tekwill.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Task getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.save(task);
    }

    @PutMapping
    public Task put(@RequestBody Task task) {
        return service.save(task);
    }
}