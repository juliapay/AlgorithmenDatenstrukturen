package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P1_DoctorWaitingList;

public class Node {
    private String name;
    private String socialSecurityNo;
    private Node next;
    private Node prev;

    public Node(String name, String socialSecurityNo) {
        this.name = name;
        this.socialSecurityNo = socialSecurityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
