package at.campus02.AlgorithmenDatenstrukturen.Hashtable.UeVorlesung;

public class CitizenHash {
    public String citizen[];
    public int size;

    public CitizenHash(int size) {
        this.citizen = new String[size];
        this.size = size;
    }

    public void add(int socialSecurityNumber, String name) {
        //Postition berechnen
        int pos = socialSecurityNumber % size;
        citizen[pos] = name;
    }

    public String search(int socialSecurityNumber) {
        //Postion berechnen
        int pos = socialSecurityNumber % size;
        return citizen[pos];
    }
}
