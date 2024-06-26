package at.campus02.AlgorithmenDatenstrukturen.TreeStructure.UE02_AddAndSearch;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);
        //Variante ohne Rekursion
        //addLoop(newNode);
        if (root == null) {
            root = newNode;
            //fall Baum ist nicht leer
        } else {
            addRecursive(root, newNode);
        }
    }

    // Add - Variante Rekursion
    private void addRecursive(Node currentNode, Node newNode) {
        if (newNode.getNumber() < currentNode.getNumber()) {
            //dann linksweitergehen
            if (currentNode.getLeft() != null) {
                addRecursive(currentNode.getLeft(), newNode);
            } else {
                currentNode.setLeft(newNode);
                newNode.setParent(currentNode);
            }
        } else {
            if (currentNode.getRight() != null) {
                addRecursive(currentNode.getRight(), newNode);
            } else {
                currentNode.setRight(newNode);
                newNode.setParent(currentNode);
            }
        }
    }

    // Add - Variante Loop
    private void addLoop(Node newNode) {
        //Fall: Baum ist leer
        Node current = root;
        if (root == null) {
            root = newNode;
            //fall Baum ist nicht leer
        } else {
            while (true) {
                //neuer Wert ist kleiner
                if (newNode.getNumber() < current.getNumber()) {
                    //dann linksweitergehen
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        newNode.setParent(current);
                        break;
                    }
                } else {
                    //dann rechts weitergehen
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        newNode.setParent(current);
                        break;
                    }
                }
            }
        }
    }

    public Node searchNumber(int number) {
        //return searchNumberLoop(number);
        // TODO: Entweder Variante 1 oder 2 einkommentieren
        // Variante 1: Aufruf Rekursiv
        return searchNumberRecursive(root, number);
        // Variante 2: Aufruf Schleife
        //return searchNumberLoop(number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number) {
        // Basisfall: Wenn der aktuelle Knoten null ist oder den gesuchten Wert enthält
        if (currentNode == null) {
            return null;
        }
        else if(currentNode.getNumber() == number) {
            return currentNode;
        }
        // Wenn der gesuchte Wert kleiner ist als der Wert des aktuellen Knotens
        else if (number < currentNode.getNumber()) {
            // Dann links weitergehen
                return searchNumberRecursive(currentNode.getLeft(), number);
        }
        // Wenn der gesuchte Wert größer ist als der Wert des aktuellen Knotens
        else if(number > currentNode.getNumber()){
                return searchNumberRecursive(currentNode.getRight(), number);
        }
        // Wenn der gesuchte Wert nicht gefunden wurde, gibt den aktuellen Knoten zurück
    return null;
    }

    // Suche - Variante Schleife
    private Node searchNumberLoop(int number) {
        Node current = root;
        if (root == null) {
            return null;
        } else {
            while (true) {
                if (current.getNumber() == number) {
                    return current;
                }
                //neuer Wert ist kleiner
                if (number < current.getNumber()) {
                    //dann linksweitergehen
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    }
                } else {
                    //dann rechts weitergehen
                    current = current.getRight();
                }
            }
        }
    }

    /**
     * Funktion zur Ausgabe des gesamten Baums.
     */
    public void printTree() {
        printTree(root, "");
    }

    /**
     * Funktion zur Ausgabe des Baums unterhalb eines Knotens
     *
     * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
     * @param prefix      Zur Einr�ckung
     */
    public void printTree(Node currentNode, String prefix) {
        if (currentNode == null) {
            return;
        }
        System.out.println(prefix + currentNode.getNumber());
        printTree(currentNode.getLeft(), prefix + "L ");
        printTree(currentNode.getRight(), prefix + "R ");
    }


}
