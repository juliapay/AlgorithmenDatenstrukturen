package at.campus02.AlgorithmenDatenstrukturen.WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    protected Node first;
    protected Node last;

    // *** Methoden ***

    public Node getFirst() {
        // TODO
        return null;
    }

    public void setFirst(Node first) {
        // TODO
    }

    public Node getLast() {
        // TODO
        return null;
    }

    public void setLast(Node last) {
        // TODO
    }

    void insertWagonAtFirstPos(String wagonId) {
Node newNode = new Node(wagonId);

        if (first == null) {
            //code wenn liste leer ist
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
        // TODO
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
