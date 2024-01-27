package com.api.Tarefas;

import com.api.Tarefas.entity.Tarefas;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TarefasApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCriarTarefasSucesso() {
		var tarefa = new Tarefas("Academia", "Manter os treinos em dia.", false, 1);

		webTestClient
				.post()
				.uri("/tarefas")
				.bodyValue(tarefa)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isNotEmpty()
				.jsonPath("$[0].nome").isEqualTo(tarefa.getNome())
				.jsonPath("$[0].descricao").isEqualTo(tarefa.getDescricao())
				.jsonPath("$[0].realizado").isEqualTo(tarefa.isRealizado())
				.jsonPath("$[0].prioridade").isEqualTo(tarefa.getPrioridade());
	}

	@Test
	void testeCriarTarefasInsucesso() {
		webTestClient
				.post()
				.uri("/tarefas")
				.bodyValue(new Tarefas("", "", false, 0))
				.exchange()
				.expectStatus().isBadRequest();

	}

}
