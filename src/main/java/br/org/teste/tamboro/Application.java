package br.org.teste.tamboro;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.teste.tamboro.questions.QuestionFour;
import br.org.teste.tamboro.questions.QuestionOne;

@SpringBootApplication
public class Application {

	@PostConstruct
	void started() {
		QuestionOne questionOne = new QuestionOne();
		questionOne.preencherLista(10);
		System.out.println("Questão 1 - Lista com 10 Números: ");
		System.out.println("Elemento do meio: " + questionOne.getElementoDoMeio());

		QuestionFour questionFour = new QuestionFour();
		System.out.println("Questão 4 - Asserções: ");
		System.out.println("(a, a) - " + questionFour.match("a", "a"));
		System.out.println("(a, a*) - " + questionFour.match("a", "a*"));
		System.out.println("(, a*) - " + questionFour.match("", "a*"));
		System.out.println("(, a*a) - " + questionFour.match("", "a*a"));
		System.out.println("(a, .) - " + questionFour.match("a", "."));
		System.out.println("(a, .*) - " + questionFour.match("a", ".*"));
		System.out.println("(ab, a*b*) - " + questionFour.match("ab", "a*b*"));
		System.out.println("(ab, a*.*b) - " + questionFour.match("ab", "a*.*b"));
		System.out.println("(ab, a*c) - " + questionFour.match("ab", "a*c"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}