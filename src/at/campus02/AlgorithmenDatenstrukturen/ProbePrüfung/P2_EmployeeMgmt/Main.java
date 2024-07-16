package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P2_EmployeeMgmt;

public class Main
{
    public static void main(String[] args)
    {
        Tree employees = new Tree();

        employees.buildExampleTree();

        printResult(employees.searchForNumber(53), "Thomas");
        printResult(employees.searchForNumber(87), "Franz");
        printResult(employees.searchForNumber(90), "Stefan");
        printResult(employees.searchForNumber(11), "Klaus");
        printResult(employees.searchForNumber(77), "Lisa");
        printResult(employees.searchForNumber(79), "NULL");
    }

    private static void printResult(Employee foundEmployee, String expectedName)
    {
        System.out.print("Nummer: " + (foundEmployee == null ? "NULL" : foundEmployee.getNumber()) + " - ");
        System.out.print("[Ist] ");
        System.out.print((foundEmployee == null ? "NULL" : foundEmployee.getName()) + " ");
        System.out.println("[Soll] " + expectedName);
    }
}
