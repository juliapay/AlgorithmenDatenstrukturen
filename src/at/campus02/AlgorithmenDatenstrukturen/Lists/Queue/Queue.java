package at.campus02.AlgorithmenDatenstrukturen.Lists.Queue;

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

    public void enqueue(Person newPerson) {
        Node newNode = new Node(newPerson);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    public Person dequeue() {
        if(front==null){
            return null;
        }
        //zwischenspeichern der Person sonst verloren
        Person person = front.getPerson();

        if (front == rear) {
            rear = null;
        }
        front = front.getNext();
        return person;
    }
}
