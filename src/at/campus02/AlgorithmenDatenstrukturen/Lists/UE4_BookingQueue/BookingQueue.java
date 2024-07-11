package at.campus02.AlgorithmenDatenstrukturen.Lists.UE4_BookingQueue;

public class BookingQueue {
    // *** Membervariablen ***
    private Node front;
    private Node rear;

    // *** Getter- und Setter-Methoden ***
    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }
// *** Operationen ***

    public void enqueue(Booking newBooking) {
        Node newNode = new Node(newBooking);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.setNext(rear);
            rear = newNode;
        }
    }

    public Booking dequeue() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }
        Booking firstBooking = front.getBooking();
        if (front == rear) {
            rear = null;
            return firstBooking;
        }
        front = front.getNext();
        return firstBooking;
    }

    public int getCount() {
        int counter = 0;
        Node current = front;
        while (current != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }
}
