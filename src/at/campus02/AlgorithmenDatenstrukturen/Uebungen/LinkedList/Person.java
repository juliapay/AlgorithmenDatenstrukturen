package at.campus02.AlgorithmenDatenstrukturen.Uebungen.LinkedList;

public class Person {
    private String lastname;
    private String firstname;
    private int id;

    public Person(String lastname, String firstname, int id) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
