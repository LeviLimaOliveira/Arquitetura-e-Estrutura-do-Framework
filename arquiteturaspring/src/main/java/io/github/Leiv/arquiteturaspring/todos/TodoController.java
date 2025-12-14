package io.github.Leiv.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    public TodoEntity salvar(RequestBody TodoEntity todo) {
        return this.service.salvar(todo);
    }
}
