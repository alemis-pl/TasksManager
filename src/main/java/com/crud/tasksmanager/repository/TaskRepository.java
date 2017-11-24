package com.crud.tasksmanager.repository;

import com.crud.tasksmanager.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {
    @Override
    List<Task> findAll();

    @Override
    Task save(Task task);

    void delete(Long id);

    Optional<Task> getTaskById(Long id);

}
