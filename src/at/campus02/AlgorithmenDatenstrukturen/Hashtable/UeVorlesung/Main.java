package at.campus02.AlgorithmenDatenstrukturen.Hashtable.UeVorlesung;

public class Main {
    public static void main(String[] args) {
        CitizenHash ch = new CitizenHash(10000);
        ch.add(312456778, "Pablo Escobar");
        //suche
        String foundname= ch.search(312456778);
        System.out.println("gefundener Name: "+foundname);
    }
}
