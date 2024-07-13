package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);
        //Variante ohne Rekursion
        //addLoop(newNode);
        if (root == null) {
            root = newNode;
            //fall: Baum ist nicht leer
        } else {
            addRecursive(root, newNode);
        }
    }

    //TREE ADD RECURSIVE
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

    //TREE ADD LOOP
    private void addWithLoop(Node newNode) {
        Node current = root;
        if (root == null) {
            root = newNode;
        } else {
            while (true) {
                if (newNode.getNumber() < current.getNumber()) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        newNode.setParent(current);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        newNode.setParent(current);
                    }
                }
            }
        }

    }

    //TREE SEARCH RECURSIVE
    public Node searchRecursive(Node current, int number) {
        if (current == null) {
            return null;
        } else if (current.getNumber() == number) {
            return current;
        } else if (current.getNumber() > number) {
            return searchRecursive(current.getLeft(), number);
        } else if (current.getNumber() < number) {
            return searchRecursive(current.getRight(), number);
        }
        return null;
    }

    //TREE SEARCH LOOP
    public Node searchWithLoop(int number) {
        Node current = root;
        if (root == null) {
            return null;
        } else {
            while (current != null && current.getNumber() != number) {

                if (number < current.getNumber()) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    }
                } else {
                    current = current.getRight();
                }
            }
            return current;
        }
    }
}
