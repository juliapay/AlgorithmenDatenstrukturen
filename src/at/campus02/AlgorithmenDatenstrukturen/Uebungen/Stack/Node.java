package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Stack;

public class Node {
    private final String name;
    private Node next;

    public Node(String name) {
        this.name = name;
        this.next = next;
    }

    public String getName() {
        return name;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
