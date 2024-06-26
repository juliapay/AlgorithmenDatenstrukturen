package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P2_EmployeeTree;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void addNewEmployeeLoop(int id) {
        Node newNode = new Node(id);
        Node current = root;
        if (root == null) {
            root = newNode;
            //fall Baum ist nicht leer
        } else {
            while (true) {
                if (newNode.getId() < current.getId()) {
                    //dann linksweitergehen
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else {
                    //dann rechts weitergehen
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }
    public void addNewEmployeeId(int id) {
        //addNewEmployeeLoop(id);
       Node newNode= new Node(id);
        //Variante ohne Rekursion
        //addLoop(newNode);
        if (root == null) {
            root = newNode;
            //fall Baum ist nicht leer
        } else {
            addRecursive(root, id);
        }
    }
    private void addRecursive(Node current, int id) {
        if (id < current.getId()) {
            if (current.getLeft() != null) {
                addRecursive(current.getLeft(), id);
            } else {
                current.setLeft(new Node(id));
            }
        }
        if (id > current.getId()) {
            if (current.getRight() != null) {
                addRecursive(current.getRight(), id);
            } else {
                current.setRight(new Node(id));
            }
        }
    }
}


