package at.campus02.AlgorithmenDatenstrukturen.Uebungen.DoubleLinkedList;


public class DoubleLinkedList {
    private Node first;
    private  Node last;


    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }
    public  void insertAtFirstPosition(String name){
        Node newNode= new Node(name);
        if(first==null){
            first=newNode;
            last=newNode;
        }else{
            newNode.setNext(first);
            first.setPrevious(newNode);
            first=newNode;
        }
    }
    public void removeNodeFromLastPosition(){
        if(first==last){
            first=null;
            last=null;
        }else{
            Node predecessor=last.getPrevious();
            last.setPrevious(null);
            predecessor.setNext(null);
            last=predecessor;
        }
    }
}
