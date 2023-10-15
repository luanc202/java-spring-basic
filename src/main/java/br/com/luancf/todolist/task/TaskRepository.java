package br.com.luancf.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, Long> {

    List<TaskModel> findByUserId(UUID idUser);
}
