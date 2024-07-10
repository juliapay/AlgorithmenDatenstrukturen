package at.campus02.AlgorithmenDatenstrukturen.Uebungen.LinkedList;

public class List {
    private Node first;
    private Node last;

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

    public void addToLastPosition(Person person) {
        Node newNode = new Node(person);
        if (first == last) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteFromLastPosition() {
        Node current = first;
        if (first == null) {
            return;
        }
        if (first == last) {
            first = null;
            last = null;
        } else {
            while (current.getNext() != last) {
                current = current.getNext();
            }
            current.setNext(null);
            last = current;
        }
    }

    public void deleteFromPostion(int postion) {
        Node current = first;
        if (first == null) {
            return;
        }
        if (postion == 0) {
            if (first.getNext() == null) {
                first = null;
            } else {
                first = current.getNext();
            }
        } else {
            for (int i = 0; i < postion - 1; i++) {
                if (current.getNext() == null) {
                    return;
                } else {
                    current = current.getNext();
                }
            }
            if (current.getNext().getNext() == null) {
                current.setNext(null);
            } else {
                current.setNext(current.getNext().getNext());
            }
        }
    }

    public Person getNodeAtAnIndex(int postion) {
        Node current = first;
        if (first == null) {
            return null;
        }
        for (int i = 0; i < postion; i++) {
            current = current.getNext();
        }
        if (current == null) {
            return null;
        } else {
            return current.getPerson();
        }
    }
}
