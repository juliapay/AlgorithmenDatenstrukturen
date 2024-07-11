package at.campus02.AlgorithmenDatenstrukturen.Lists.UE7_MovieLinkedList;

public class MovieLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Methoden ***
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public Node getMovieAtIndex(int index) {
        if (first == null) {
            return null;
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current;
        }
    }

    public void insertMovieTitleAtIndex(String movieTitle, int index) {
        Node newNode = new Node(movieTitle);

        // Liste ist leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        // List ist nicht leer
        else {
            // Erste Stelle
            if (index == 0) {
                newNode.setNext(first);
                first.setPrev(newNode);
                first = newNode;
            } else {
                // Vorgänger suchen
                Node predecessorNode = getMovieAtIndex(index - 1);

                // Vorgänger nicht gefunden
                if (predecessorNode == null) {
                    // Index ist nicht korrekt. Deshalb an letzter Stelle einfügen.
                    predecessorNode = last;
                }

                Node followingNode = predecessorNode.getNext();

                predecessorNode.setNext(newNode);
                newNode.setPrev(predecessorNode);

                if (followingNode != null) {
                    newNode.setNext(followingNode);
                    followingNode.setPrev(newNode);
                }

                if (predecessorNode == last)
                    last = newNode;
            }
        }
    }

    public void deleteMovieAtIndex(int index) {
        // Liste ist leer
        if (first == null)
            return;
            // Liste ist nicht leer
        else {
            // First löschen
            if (index == 0) {
                Node followingNode = getMovieAtIndex(index + 1);
                if (followingNode != null) {
                    followingNode.setPrev(null);
                    first.setNext(null);
                }

                if (first == last)
                    last = null;

                first = followingNode;
            } else {
                Node deleteNode = getMovieAtIndex(index);

                if (deleteNode == null)
                    return;

                Node predecessorNode = deleteNode.getPrev();
                Node followingNode = deleteNode.getNext();

                predecessorNode.setNext(followingNode);
                deleteNode.setPrev(null);
                deleteNode.setNext(null);
                if (followingNode != null)
                    followingNode.setPrev(predecessorNode);

                if (deleteNode == last)
                    last = predecessorNode;
            }
        }
    }

    public void printList() {
        Node currentNode = this.getFirst();

        System.out.print("*** Start: ");
        if (currentNode == null) {
            System.out.print("<empty>");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getMovieTitle() + ", ");
                currentNode = currentNode.getNext();
            }
        }
        System.out.println();
    }

}
