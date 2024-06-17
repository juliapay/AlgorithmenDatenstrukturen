package at.campus02.AlgorithmenDatenstrukturen.SimpleLinkedList;

public class Node {
    private String lebensmittel;    // =WERT
    private Node next;      // =REFERENZ

    public Node(String lebensmittel) {
        this.lebensmittel = lebensmittel;
        this.next = null;
    }

    public String getLebensmittel() {
        return lebensmittel;
    }

    public void setLebensmittel(String lebensmittel) {
        this.lebensmittel = lebensmittel;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
