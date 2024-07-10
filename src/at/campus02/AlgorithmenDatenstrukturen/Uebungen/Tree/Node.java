package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree;

public class Node {
    private Node left;
    private Node right;
    private Node parent;
    private int number;

    public Node(int number) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.number = number;
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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
