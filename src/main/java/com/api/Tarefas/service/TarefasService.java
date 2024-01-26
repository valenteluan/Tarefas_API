package com.api.Tarefas.service;

import com.api.Tarefas.entity.Tarefas;
import com.api.Tarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {

    @Autowired
    private TarefasRepository repository;

    public List<Tarefas> create(Tarefas tarefas) {
        repository.save(tarefas);
        return list();
    }

    public List<Tarefas> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome")).ascending();
        return repository.findAll(sort);
    }

    public List<Tarefas> update(Tarefas tarefas) {
        repository.save(tarefas);
        return list();
    }

    public List<Tarefas> delete(Long id) {
        repository.deleteById(id);
        return list();
    }

}
