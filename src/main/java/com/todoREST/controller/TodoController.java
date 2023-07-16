package com.todoREST.controller;

import com.todoREST.dto.TodoDto;
import com.todoREST.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/todo")
public class TodoController {

    private TodoService todoService;


//    spring.security.user.name=root
//    spring.security.user.password=root



// CREATE TODO REST API
//    http://localhost:8090/api/todo/create
    @PostMapping("create")
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){

        TodoDto  SavedTodo =todoService.addTodo(todoDto);

        return new  ResponseEntity<>(SavedTodo,HttpStatus.CREATED);
    }


    // GET TODO BY ID REST API
    //    http://localhost:8090/api/todo/get/id
    @GetMapping("get/{id}")
    public ResponseEntity<TodoDto> getTodo(@RequestBody @PathVariable("id") long id){

        TodoDto todoDto=todoService.getTodo(id);
        return new ResponseEntity<>(todoDto,HttpStatus.OK);

    }


    // GET ALL TODOS  REST API
    //   http://localhost:8090/api/todo/getalltodos
    @GetMapping("getalltodos")
    public ResponseEntity<List<TodoDto>> getAllTodos(){

       List <TodoDto> todoDto =todoService.getAllTodo();

       return new ResponseEntity<>(todoDto,HttpStatus.OK);

    }

    // UPDATE REST API
    @PutMapping("update/{id}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id") long id){

        TodoDto todoDtoupdated =todoService.updateTodo(todoDto,id);
        return new ResponseEntity<>(todoDtoupdated,HttpStatus.OK);
    }

    // DELETE REST API
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteTodo (@PathVariable("id") long id){

        todoService.deletetodo(id);
        return new ResponseEntity<>("Successfully deleted",HttpStatus.OK);
    }


//    http://localhost:8090/api/todo/complete/2

    // Compelete REST API
    @PatchMapping("complete/{id}")
    public ResponseEntity<TodoDto> completedTodo (@RequestBody @PathVariable("id") long id){

        TodoDto tododto =todoService.completedTodo(id);
        return new ResponseEntity<>(tododto,HttpStatus.OK);
    }

}
