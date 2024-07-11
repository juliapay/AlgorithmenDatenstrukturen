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
        Node newNode= new Node(movieTitle);
    }

    public void deleteMovieAtIndex(int index) {
        // TODO
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
