package md.tekwill.todo.service;


import md.tekwill.todo.entity.Task;
import md.tekwill.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAll() {
        return (List<Task>) repository.findAll();
    }

    public Task getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Task save(Task task) {
        return repository.save(task);
    }
}