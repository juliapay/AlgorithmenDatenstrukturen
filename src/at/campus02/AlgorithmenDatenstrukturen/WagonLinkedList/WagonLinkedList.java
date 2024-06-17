package at.campus02.AlgorithmenDatenstrukturen.WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    protected Node first;
    protected Node last;

    // *** Methoden ***


    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
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
        if (last == null) {
            // Die Liste ist bereits leer
            return;
        }

        if (first == last) {
            // Es gibt nur einen Knoten in der Liste
            first = null;
            last = null;
        } else {
            // Mehrere Knoten in der Liste
            last = last.prev;
            last.setNext(null);
        }
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
