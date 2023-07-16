package com.todoREST.service;

import com.todoREST.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodo(long id);

    List<TodoDto> getAllTodo();

    TodoDto updateTodo(TodoDto todoDto,long id);

    void deletetodo(long id);

    TodoDto completedTodo(long id);
}
