package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Queue;

public class Queue {
    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enqueue(String name) {
        Node newNode = new Node(name);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public String dequeue() {
        Node current = front;
        if (front == rear) {
            front = null;
            rear = null;

        } else {
            front = current.getNext();
        }
        return current.getName();
    }

    public int getcount() {
        int counter = 0;
        Node current = front;

        while (current.getNext() != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }
}
