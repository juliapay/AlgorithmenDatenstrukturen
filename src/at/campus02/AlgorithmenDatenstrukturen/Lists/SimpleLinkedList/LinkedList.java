package at.campus02.AlgorithmenDatenstrukturen.Lists.SimpleLinkedList;

public class LinkedList {

    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    //Knoten immer am Ende der Liste anhaengen
    public void addNodeAtLastPos(String lebensmittel) {
        Node newNode = new Node(lebensmittel);

        if (first == null) {
            //code wenn liste leer ist
            first = newNode;
            last = newNode;
        } else {
            //code wenn Liste nicht mehr leer ist
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addNodeAtFirstPos(String lebensmittel) {
        Node newNode = new Node(lebensmittel);

        if (first == null) {
            //code wenn liste leer ist
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void deleteIndexAtPos(int position) {
        Node current = first;
        //Suche der korrekten Position
        //Position 0 bedeutet erster Knoten

        //falls Liste leer ist 0<0
        if (first == null) {
            return;
        } else if (position == 0) {
            //Wenn Liste nur aus einem Element besteht
            if (first == last) {
                last = null;
            }
            // zweites wird zum ersten
            first = current.getNext();
        } else {
            //Suchen des Vorgängers
            //0<(2-1) = 0<1
            for (int i = 0; i < position - 1; i++) {
                if (current == last) {
                    return;
                }
                current = current.getNext();
            }
            if (current.getNext() == last) {
                last = current;
            }
            current.setNext(current.getNext().getNext());
            //last gegebenfalls anpassen

        }
    }
}
