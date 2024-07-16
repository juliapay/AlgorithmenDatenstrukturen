package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P2_EmployeeMgmt;

public class Node {
    private Employee employee;
    private Node left;
    private Node right;

    public Node(Employee employee) {
        this.employee = employee;
        left = null;
        right = null;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
