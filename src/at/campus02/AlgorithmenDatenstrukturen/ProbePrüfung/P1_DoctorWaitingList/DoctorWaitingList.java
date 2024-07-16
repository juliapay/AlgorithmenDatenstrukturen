package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P1_DoctorWaitingList;

public class DoctorWaitingList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void addPatientAtLastPos(String name, String socialSecurityNo) {
        //TODO: Implementierung hinzfuegen
        //knoten anlegen
        Node newNode = new Node(name, socialSecurityNo);
        newNode.setName(name);
        newNode.setSocialSecurityNo(socialSecurityNo);
        //fall: liste ist leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        //fall: liste ist befüllt
        else {
            //utolsot az uj node ele helyezzuk
            newNode.setPrev(last);
            //az nodeot az utolso möge
            last.setNext(newNode);
            //az uj node lesz az utolso
            last = newNode;
        }
    }
}
