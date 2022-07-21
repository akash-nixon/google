package com.nightmare.google.TodoService;

import com.nightmare.google.Todo;
import com.nightmare.google.TodoRepository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    private Todo todo;

    public List<Todo> GetAllTask() {
        List<Todo> todoList = todoRepository.findAll();
        return todoList;
    }

    public Optional<Todo> GetTask(Long Id) {
        return todoRepository.findById(Id);
    }

    public void DeleteAllTask() {
        todoRepository.deleteAll();
    }

    public void DeleteTask(long id) {
        todoRepository.deleteById(id);

    }
    public void UpdateTask (Todo todo){
        todoRepository.save(todo);
    }
    public void AddTask (Todo todo){
        todoRepository.save(todo);
    }
    }

