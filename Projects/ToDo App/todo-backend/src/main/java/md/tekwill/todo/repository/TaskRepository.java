package md.tekwill.todo.repository;

import md.tekwill.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> { //CrudRepository<Task, Long>
}