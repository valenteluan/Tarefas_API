package com.api.Tarefas.repository;

import com.api.Tarefas.entity.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
}
