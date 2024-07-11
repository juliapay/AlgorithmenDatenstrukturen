package at.campus02.AlgorithmenDatenstrukturen.Lists.UE7_MovieLinkedList;

public class Node {
    // *** Membervariablen ***
    private String movieTitle;
    private Node next;
    private Node prev;

    // *** Methoden ***

    public Node(String movieTitle) {
        this.movieTitle = movieTitle;
        this.next = next;
        this.prev = prev;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
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
