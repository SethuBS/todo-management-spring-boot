package net.guides.springboot.todomanagementspringboot.repository;

import net.guides.springboot.todomanagementspringboot.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
        List<Todo> findByUserName(String user);
}
