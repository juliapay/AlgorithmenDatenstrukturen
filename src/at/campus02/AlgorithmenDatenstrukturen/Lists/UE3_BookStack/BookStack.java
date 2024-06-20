package at.campus02.AlgorithmenDatenstrukturen.Lists.UE3_BookStack;

public class BookStack {
    // *** Membervariablen ***
    private Node top;
    private int count;

    // *** Getter- und Setter-Methoden ***


    public Node getTop() {
        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle) {
        Node newNode = new Node(bookTitle);
        newNode.setNext(top);
        top = newNode;
    }

    public String pop() throws StackEmptyException {
        if (top == null) {
            throw new StackEmptyException("Stack is empty. Cannot pop value.");
        }
        String bookTitle = top.getBookTitle();
        top = top.getNext();
        return bookTitle;
    }

    public int getCount() {
        count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;

    }
}
