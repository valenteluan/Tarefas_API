package com.api.Tarefas.controller;

import com.api.Tarefas.entity.Tarefas;
import com.api.Tarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class Controller {

    @Autowired
    private TarefasService service;

    @PostMapping
    List<Tarefas> create(@RequestBody Tarefas tarefas) {
        return service.create(tarefas);
    }

    @GetMapping
    List<Tarefas> list() {
        return service.list();
    }

    @PutMapping
    List<Tarefas> update(@RequestBody Tarefas tarefas) {
        return service.update(tarefas);
    }

    @DeleteMapping("/{id}")
    List<Tarefas> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

}
