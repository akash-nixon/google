package com.nightmare.google.TodoController;

import com.nightmare.google.Todo;
import com.nightmare.google.TodoService.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/task")
    public List<Todo> GetAllTask(){

        return todoService.GetAllTask();
    }

    @RequestMapping(method= RequestMethod.GET,value = "/task/{id}")
    public Optional<Todo> GetTask(@PathVariable long id){

        return todoService.GetTask(id);
    }

    @RequestMapping(method= RequestMethod.PUT,value="/task/{id}")
    public void updateTask(@RequestBody Todo todo, @PathVariable Long id){
        todoService.UpdateTask(todo);
    }

    @RequestMapping(method= RequestMethod.POST,value="/task")
    public void AddTask(@RequestBody Todo todo){
        todoService.AddTask(todo);
    }

    @RequestMapping(method= RequestMethod.DELETE,value="/task")
    public List<Todo> DeleteAllTask(){
        todoService.DeleteAllTask();
        return todoService.GetAllTask() ;
    }

    /*@RequestMapping(method= RequestMethod.DELETE,value="/task/{id}")*/
    @DeleteMapping("/task/{id}")
    public List<Todo> DeleteTask(@PathVariable("id") Long id){
        todoService.DeleteTask(id);
        return todoService.GetAllTask();
    }

//    @RequestMapping("/login")
//    public String loginPage()
//    {
//        return "login.html";
//    }
//
//    @RequestMapping("/logout-success")
//    public String logoutPage()
//    {
//        return "logout.html";
//    }
}
