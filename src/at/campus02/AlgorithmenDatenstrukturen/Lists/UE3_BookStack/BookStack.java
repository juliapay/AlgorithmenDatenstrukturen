package at.campus02.AlgorithmenDatenstrukturen.Lists.UE3_BookStack;

public class BookStack {
    // *** Membervariablen ***
    // Der oberste Knoten im Stack
    private Node top;
    // Die Anzahl der Knoten im Stack
    private int count;

    // *** Getter- und Setter-Methoden ***
    // Gibt den obersten Knoten im Stack zurück
    public Node getTop() {
        return top;
    }

    // *** Operationen ***

    // Methode zum Hinzufügen eines Buches zum Stack
    public void push(String bookTitle) {
        // Erstelle einen neuen Knoten mit dem Buchtitel
        Node newNode = new Node(bookTitle);
        // Setze den neuen Knoten an die Spitze des Stacks
        newNode.setNext(top);
        // Aktualisiere den top-Zeiger auf den neuen Knoten
        top = newNode;
    }

    // Methode zum Entfernen des obersten Buches vom Stack
    public String pop() throws StackEmptyException {
        // Überprüfe, ob der Stack leer ist
        if (top == null) {
            // Werfe eine Ausnahme, wenn der Stack leer ist
            throw new StackEmptyException("Stack is empty. Cannot pop value.");
        }
        // Speichere den Buchtitel des obersten Knotens
        String bookTitle = top.getBookTitle();
        // Setze den top-Zeiger auf den nächsten Knoten
        top = top.getNext();
        return bookTitle;
    }

    // Methode zum Zählen der Anzahl der Knoten im Stack
    public int getCount() {
        // Setze den Zähler auf null
        count = 0;
        // Starte am obersten Knoten
        Node current = top;
        // Durchlaufe die Knoten im Stack und zähle sie
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}