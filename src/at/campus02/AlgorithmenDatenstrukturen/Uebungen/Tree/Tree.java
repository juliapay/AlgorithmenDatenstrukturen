package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addRecursive(Node current, Node newNode) {
        if (newNode.getNumber() < current.getNumber()) {
            if (current.getLeft() != null) {
                addRecursive(current.getLeft(), newNode);
            } else {
                current.setLeft(newNode);
                newNode.setParent(current);
            }
        } else {
            if (current.getRight() != null) {
                addRecursive(current.getRight(), newNode);
            } else {
                current.setRight(newNode);
                newNode.setParent(current);
            }
        }
    }

    public Node searchRecusive(Node current, int number) {
        if (current == null) {
            return null;
        } else if (current.getNumber() == number) {
            return current;
        } else if (current.getNumber() > number) {
            return searchRecusive(current.getLeft(), number);
        } else if (current.getNumber() < number) {
            return searchRecusive(current.getRight(), number);
        }
        return null;
    }
}
