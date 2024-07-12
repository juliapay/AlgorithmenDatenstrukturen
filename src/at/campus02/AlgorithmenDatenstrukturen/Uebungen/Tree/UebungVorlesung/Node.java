package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree.UebungVorlesung;

public class Node {
    private  Book book;
    private Node left;
    private Node right;

    public Node(Book book) {
        this.book = book;
        this.left = left;
        this.right = right;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
