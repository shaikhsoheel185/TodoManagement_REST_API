package com.todoREST.service.impl;

import com.todoREST.dto.TodoDto;
import com.todoREST.entity.Todo;
import com.todoREST.exception.ClassNotFoundException;
import com.todoREST.repositry.TodoRepositry;
import com.todoREST.service.TodoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    TodoRepositry todoRepositry;
    ModelMapper modelMapper;



    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        Todo todo = modelMapper.map(todoDto,Todo.class);

        // Todo Japa Entity
        Todo todosave =todoRepositry.save(todo);


        TodoDto todoSavedDto = modelMapper.map(todosave,TodoDto.class);


        return todoSavedDto;
    }

    @Override
    public TodoDto getTodo(long id) {
        Todo todo =todoRepositry.findById(id).
                orElseThrow(()-> new ClassNotFoundException("todo not founf by id:"+id));

        TodoDto todoDto = modelMapper.map(todo,TodoDto.class);

        return todoDto;
    }

    @Override
    public List<TodoDto> getAllTodo() {

       List<Todo> todos =todoRepositry.findAll();


        return todos.stream()
                .map(todo -> modelMapper.map(todo, TodoDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, long id) {

         Todo todo =todoRepositry.findById(id).get();

         todo.setTitle(todoDto.getTitle());
         todo.setDescription(todoDto.getDescription());
         todo.setCompleted(todoDto.isCompleted());

         Todo todoupdate =todoRepositry.save(todo);
         TodoDto todoupdated =modelMapper.map(todoupdate,TodoDto.class);
         return todoupdated;

    }

    @Override
    public void deletetodo(long id) {
         todoRepositry.deleteById(id);
    }

    @Override
    public TodoDto completedTodo( long id) {
        Todo todo =todoRepositry.findById(id).get();

        todo.setCompleted(Boolean.TRUE);

        Todo updatedtodo =todoRepositry.save(todo);

        TodoDto updateDto =modelMapper.map(updatedtodo,TodoDto.class);
        return updateDto;
    }
}
