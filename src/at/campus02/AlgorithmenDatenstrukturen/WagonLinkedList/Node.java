package at.campus02.AlgorithmenDatenstrukturen.WagonLinkedList;

public class Node {
    // *** Membervariablen ***
    protected String wagonId;
    protected Node next;
    protected Node prev;

    public Node(String wagonId) {
        this.wagonId = wagonId;
        this.next = null;
        this.prev = null;
    }

    // *** Getter- & Setter-Methoden ***


    public String getWagonId() {
        return wagonId;
    }

    public void setWagonId(String wagonId) {
        this.wagonId = wagonId;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
