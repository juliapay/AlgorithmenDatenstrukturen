package at.campus02.AlgorithmenDatenstrukturen.Lists.WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

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

    void insertWagonAtLastPos(String wagonId) {
        Node newNode = new Node(wagonId);

        if (first == null) {
            //code wenn liste leer ist
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
            last.setPrev(last.getPrev());
            last.setNext(null);
        }
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
            last = last.getPrev();
            last.setNext(null);
        }
    }

    void removeWagonFromPos(int position) {
        Node current=first;
        if (last == null) {
            // Die Liste ist bereits leer
            return;
        }
        if (first == last) {
            // Es gibt nur einen Knoten in der Liste
            first = null;
            last = null;
        } else {
            // falls der knoten bekannt ist
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());

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
