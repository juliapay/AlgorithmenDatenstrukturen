package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P1_Passport;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void addNewPersonAtLastPos(String lastName) {
        Node newNode = new Node(lastName);
        if (first == null) {
            //code wenn liste leer ist
            first = newNode;
            last = newNode;
        } else {
            //code wenn Liste nicht mehr leer ist
            last.setNext(newNode);
            last = newNode;
        }
    }
}

