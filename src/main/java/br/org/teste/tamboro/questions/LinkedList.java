package br.org.teste.tamboro.questions;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        this.tail = this.head;
    }

    public Node getHead() {
        return this.head;
    }

    public void add(Node node) {
        this.tail.setNext(node);
        this.tail = node;
    }
}