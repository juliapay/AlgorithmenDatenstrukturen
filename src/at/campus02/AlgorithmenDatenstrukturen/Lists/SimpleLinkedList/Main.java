package at.campus02.AlgorithmenDatenstrukturen.Lists.SimpleLinkedList;

import at.campus02.AlgorithmenDatenstrukturen.Lists.SimpleLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeAtLastPos("Mango");
        linkedList.addNodeAtLastPos("Eis");
        linkedList.addNodeAtLastPos("Joghurt");
        System.out.println("First: " + linkedList.getFirst().getLebensmittel());
        System.out.println("Last: " + linkedList.getLast().getLebensmittel());
        linkedList.deleteIndexAtPos(0);
        System.out.println("First: " + linkedList.getFirst().getLebensmittel());
        System.out.println("Last: " + linkedList.getLast().getLebensmittel());
    }
}
