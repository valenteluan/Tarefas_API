<h1 align="center">
  TODO List - Tarefas
</h1>

API para gerenciar tarefas (CRUD). Desafio backend júnior.

## Tecnologias
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Swagger
- Mysql

## Como Executar

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints


- Criar Tarefa 
```
$ http POST localhost:8080/tarefas

[
  {
    "nome": "Nome",
    "descricao": "Digite uma Descrição",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas
```
$ http GET localhost:8080/tarefas
```

- Atualizar Tarefa
```
$ http PUT localhost:8080/tarefas/1

[
  {
    "nome": "Nome",
    "descricao": "Digite uma Descrição",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE localhost:8080/tarefas/1
