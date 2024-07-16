package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P2_EmployeeMgmt;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void buildExampleTree() {
        root = new Node(new Employee(53, "Thomas"));

        Node r = new Node(new Employee(78, "Francesca"));
        root.setRight(r);

        Node l = new Node(new Employee(45, "Laura"));
        root.setLeft(l);

        Node ll = new Node(new Employee(40, "Marc"));
        l.setLeft(ll);

        Node lr = new Node(new Employee(49, "Peter"));
        l.setRight(lr);

        Node rr = new Node(new Employee(90, "Stefan"));
        r.setRight(rr);

        Node lll = new Node(new Employee(11, "Klaus"));
        ll.setLeft(lll);

        Node rrl = new Node(new Employee(87, "Franz"));
        rr.setLeft(rrl);

        Node rl = new Node(new Employee(77, "Lisa"));
        r.setLeft(rl);
    }

//    public Employee searchForNumber(int number) {
//
//        return searchForNumberRecursive(root, number);
//    }

    private Employee searchForNumberRecursive(Node currentNode, int number) {
        //currentNode -  aktueller postition, wo geprüft werden soll
        //numdber - ist der gesuchte wert
        if (currentNode.getEmployee().getNumber() == number) {
            return currentNode.getEmployee();
        } else if (number < currentNode.getEmployee().getNumber()) {
            return searchForNumberRecursive(currentNode.getLeft(), number);
        } else if(number > currentNode.getEmployee().getNumber()) {
            return searchForNumberRecursive(currentNode.getRight(),number);
        } else {
            return null;
        }
    }

    public Employee searchForNumber(int number) {
        // TODO: Implementierung hinzufuegen
        //hilfsvariable
        Node current = root;

        //fall: baum ist nicht leer
        while (current != null) {
            //knoten gefunden - root vergleichen
            if (current.getEmployee().getNumber() == number) {
                return current.getEmployee();
            } else if (number < current.getEmployee().getNumber()) {
                //ha a keresett szamom kisebb, mint az aktualis node, akkor jobbra megy
                current = current.getLeft();
            } else {
                //ha nagyobb, akkor balra
                current = current.getRight();
            }
        } return null;
    }
}
