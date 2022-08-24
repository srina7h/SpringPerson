package com.nseit.SpringPerson.service;

import com.nseit.SpringPerson.model.Todo;
import com.nseit.SpringPerson.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    public TodoRepository todoRepository;

    public void add(Todo todo) {
        todoRepository.save(todo);

    }

    public void update(Todo todo) {
        todoRepository.save(todo);

    }

    public List<Todo> view() {
        return todoRepository.findAll();

    }

    public void delete(int id) {
        for (Todo todo : todoRepository.findAll()) {
            if (id == todo.getId()) {
                todoRepository.delete(todo);
            }

        }

    }

}
