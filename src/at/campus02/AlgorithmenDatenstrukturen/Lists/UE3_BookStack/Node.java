package at.campus02.AlgorithmenDatenstrukturen.Lists.UE3_BookStack;

public class Node {
    // *** Membervariablen ***
    private final String bookTitle;
    private Node next;


    // *** Konstruktor ***

    public Node(String bookTitle) {
        this.bookTitle = bookTitle;
        this.next = null;
    }


    // *** Getter- und Setter-Methoden ***

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
