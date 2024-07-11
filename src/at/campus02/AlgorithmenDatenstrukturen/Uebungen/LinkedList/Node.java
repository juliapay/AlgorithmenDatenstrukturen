package at.campus02.AlgorithmenDatenstrukturen.Uebungen.LinkedList;

public class Node {
    private Node next;
    private Objekt objekt;

    public Node(Objekt objekt) {
        this.next = next;
        this.objekt = objekt;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Objekt getObjekt() {
        return objekt;
    }

    public void setObjekt(Objekt objekt) {
        this.objekt = objekt;
    }
}
