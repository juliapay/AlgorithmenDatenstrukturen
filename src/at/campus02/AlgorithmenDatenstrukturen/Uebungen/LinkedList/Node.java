package at.campus02.AlgorithmenDatenstrukturen.Uebungen.LinkedList;

public class Node {
    private Person person;
    private Node next;

    public Node(Person person) {
        this.person = person;
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
