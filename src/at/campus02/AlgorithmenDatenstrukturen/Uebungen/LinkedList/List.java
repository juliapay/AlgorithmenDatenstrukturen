package at.campus02.AlgorithmenDatenstrukturen.Uebungen.LinkedList;

public class List {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void addObjektAtLastPosition(Objekt objekt) {
        Node newNode = new Node(objekt);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }
    public void AddAtFirstPosition(Objekt objekt){
        Node newNode=new Node(objekt);
        if(first==null){
            first=newNode;
            last=newNode;
        } else{
            newNode.setNext(first);
            first=newNode;
        }
    }

    public void addAtPosition(Objekt objekt, int position) {
        Node newNode = new Node(objekt);
        Node current = first;
        if (position == 0) {
            if (first == null) {
                first = newNode;
            } else {
                newNode.setNext(first);
                first = newNode;
            }
        } else {
            for (int i = 1; i < position - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext().getNext());
            current.setNext(newNode);
        }
    }
    public void deleteAtPosition(int position){
        Node current=first;
        if(first==null){
            return;
        }
       else if(position==0){
            if(first==last){
                last=null;
            }
           first=current.getNext();

        }else{
            for (int i = 1; i < position-1; i++) {
                if(current==last){
                    return;
                }
                current=current.getNext();
            }
            if(current.getNext()==last){
               last=current;
            }else{
                current.setNext(current.getNext().getNext());
            }
        }
    }
    public Objekt searchForObjektAtPosition(int position){
        Node current= first;
        for (int i = 0; i < position; i++) {
            current= current.getNext();
        }
        return current.getObjekt();
    }
}
