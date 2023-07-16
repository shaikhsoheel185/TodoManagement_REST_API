package com.todoREST.repositry;

import com.todoREST.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositry extends JpaRepository<Todo, Long> {

}
