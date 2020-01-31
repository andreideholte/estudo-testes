package br.org.teste.estudo.questions;

public class Node {
    private Node next;
    private String data;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return this.data;
    }
}