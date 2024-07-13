package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Stack;

public class Stack {
    private Node top;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }
    //STACK PUSH ADD TOP
    public void push(String name){
        Node newNode= new Node(name);
        if(top==null){
            top=newNode;
        }else {
            newNode.setNext(top);
            top=newNode;
        }
    }
    //STACK POP REMOVE TOP
    public String pop(){
        Node current=top;
        if(top==null){
            return "";
        }else{
            top=top.getNext();
            return current.getName();
        }
    }
    //STACK COUNT
    public int getCount(){
        int counter=0;
        Node current=top;
        while(current.getNext()!=null){
            counter++;
            current=current.getNext();

        }
        return counter;
    }
}
