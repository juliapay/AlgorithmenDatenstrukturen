package at.campus02.AlgorithmenDatenstrukturen.Uebungen.DoubleLinkedList;


public class DoubleLinkedList {
    private Node first;
    private Node last;


    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    //DOUBLELINKED LIST INSERT FIRST
    public void insertAtFirstPosition(String name) {
        Node newNode = new Node(name);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrevious(newNode);
            newNode.setNext(first);
            first = newNode;
        }
    }

    //DOUBLELINKED LIST INSERT lAST
    public void insertAtLastPosition(String name) {
        Node newNode = new Node(name);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    //DOUBLELINKED LIST REMOVE lAST
    public void removeNodeFromLastPosition() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node predecessor = last.getPrevious();
            last.setPrevious(null);
            predecessor.setNext(null);
            last = predecessor;
        }
    }

    //DOUBLELINKED LIST REMOVE FIRST
    public void removeNodeFromFirstPosition() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node current = first.getNext();
            current.setPrevious(null);
            first.setNext(null);
            first = current;
        }
    }

    //DOUBLELINKED LIST REMOVE ANY POSITION
    public void removeNodeFromPosition(int position) {
        Node current = first;
        if (first == null) {
            return;
        }
        if (position == 0) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                first.getNext().setPrevious(null);
                first.setNext(null);
                first = current;
            }
        } else {
            for (int i = 0; i < position - 1; i++) {

                if (current.getNext() == null)
                    return;

                current = current.getNext();
            }
            Node nodeToDelete = current;
            if (nodeToDelete == null)
                return;

            Node predecessorNode = nodeToDelete.getPrevious();
            Node followingNode = nodeToDelete.getNext();

            predecessorNode.setNext(followingNode);

            nodeToDelete.setPrevious(null);
            nodeToDelete.setNext(null);

            if (followingNode != null)
                followingNode.setPrevious(predecessorNode);

            if (nodeToDelete == last)
                last = predecessorNode;
        }
    }

    //DOUBLELINKED LIST SWAP
    public void swapAdjacentNodes(int position) {
        if (first == null || first.getNext() == null) {
            return; // Liste ist leer oder hat nur einen Knoten
        }

        if (position < 0) {
            return; // Ungültige Position
        }
        Node current = first;
        for (int i = 0; i < position; i++) {
            if (current.getNext() == null || current.getNext().getNext() == null) {
                return; // nicht in der liste tauschen geht nicht!
            }
            current = current.getNext();
        }

        Node firstNode = current;
        Node secondNode = current.getNext();

        // Aktualisiere die Referenzen der Vorgänger und Nachfolger
        if (firstNode.getPrevious() != null) {
            firstNode.getPrevious().setNext(secondNode);
        } else {
            first = secondNode; // secondNode wird das neue erste Element
        }

        if (secondNode.getNext() != null) {
            secondNode.getNext().setPrevious(firstNode);
        } else {
            last = firstNode; // firstNode wird das neue letzte Element
        }

        firstNode.setNext(secondNode.getNext());
        secondNode.setPrevious(firstNode.getPrevious());
        firstNode.setPrevious(secondNode);
        secondNode.setNext(firstNode);
    }

}
