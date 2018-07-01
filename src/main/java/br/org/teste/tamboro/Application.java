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
		System.out.println(questionOne.getElementoDoMeio());

		QuestionFour questionFour = new QuestionFour();
		System.out.println(questionFour.match("a", "a"));
		System.out.println(questionFour.match("a", "a*"));
		System.out.println(questionFour.match("", "a*"));
		System.out.println(questionFour.match("", "a*a"));
		System.out.println(questionFour.match("a", "."));
		System.out.println(questionFour.match("a", ".*"));
		System.out.println(questionFour.match("ab", "a*b*"));
		System.out.println(questionFour.match("ab", "a*.*b"));
		System.out.println(questionFour.match("ab", "a*c"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}