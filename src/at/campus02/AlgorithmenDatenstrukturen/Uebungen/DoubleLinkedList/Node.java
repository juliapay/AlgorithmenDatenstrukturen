package at.campus02.AlgorithmenDatenstrukturen.Uebungen.DoubleLinkedList;

public class Node {
    private String name;
    private Node next;
    private Node previous;

    public Node(String name) {
        this.name = name;
        this.next = next;
        this.previous = previous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
