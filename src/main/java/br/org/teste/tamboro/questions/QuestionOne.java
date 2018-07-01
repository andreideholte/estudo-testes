package br.org.teste.tamboro.questions;

import br.org.teste.tamboro.questions.LinkedList;
import br.org.teste.tamboro.questions.Node;

public class QuestionOne {

	LinkedList linkedList = new LinkedList();
	Node head = linkedList.getHead();

	public void preencherLista(Integer quantidade) {
		Integer number=1;

		while(quantidade>0) {
			this.linkedList.add(new Node(number.toString()));
			quantidade--;
			number++;
		}
	}

	public String getElementoDoMeio() {
		Node n1 = head.getNext();
		Node n2 = head.getNext();

		while(n2.getNext() != null) {
			n2 = n2.getNext();
			if (n2.getNext() != null) {
				n2 = n2.getNext();
				n1 = n1.getNext();
			}
		}

		return n1.getData();
	}
}
