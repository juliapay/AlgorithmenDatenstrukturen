package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P2_EmployeeMgmt;

public class Employee
{
    private final int number;
    private final String name;

    public Employee(int number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }
}
