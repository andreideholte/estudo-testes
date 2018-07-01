package br.org.teste.tamboro;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import br.org.teste.tamboro.questions.QuestionOne;

public class QuestionOneTest {

	QuestionOne questionOne;

	@Before
	public void instanciarRecurso() {
		this.questionOne = new QuestionOne();
	}

	@Test
	public void retornarElementoComQuantidadeImpar() {
		this.questionOne.preencherLista(5);
		String elemento = this.questionOne.getElementoDoMeio();
		assertThat(elemento).isEqualTo("3");
	}

	@Test
	public void retornarElementoComQuantidadePar() {
		this.questionOne.preencherLista(10);
		String elemento = this.questionOne.getElementoDoMeio();
		assertThat(elemento).isEqualTo("5");
	}
}