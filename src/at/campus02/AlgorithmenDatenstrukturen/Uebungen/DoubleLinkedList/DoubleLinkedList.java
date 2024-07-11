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

    public void insertAtFirstPosition(String name) {
        Node newNode = new Node(name);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrevious(newNode);
            first = newNode;
        }
    }

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

            if(nodeToDelete==last)
                last=predecessorNode;
        }
    }
}
