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

    //QUEUE ADD REAR
    public void enqueue(String name) {
        Node newNode = new Node(name);
        if (front == null||front==rear) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    //QUEUE REMOVE FRONT
    public String dequeue() {
        if (front == null) {
            return null;
        }
        Node current = front;
        if (front == rear) {
            front = null;
            rear = null;

        } else {
            front = front.getNext();
        }
        return current.getName();
    }
    //QUEUE COUNT
    public int getcount() {
        int counter = 0;
        Node current = front;

        while (current != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    }
}
