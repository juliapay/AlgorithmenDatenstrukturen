package at.campus02.AlgorithmenDatenstrukturen.Hashtable.UE02_LibraryHash;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash {
    private String[] books;
    private static final String TOMBSTONE = "###1234###+++---";

    // Konstruktor
    public LibraryHash(int size) {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile() {
        String line;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\s54828\\IdeaProjects\\AlgorithmenUndDatenstrukturen\\src\\books.txt"));

            while ((line = br.readLine()) != null) {
                add(line);
            }
            br.close();
        } catch (Exception | HashFullException e) {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen LINEARE BERECHNUNG
    public void add(String bookTitle) throws HashFullException {
        //auch negative Werte wenn
        //bookTitle.hashCode();
        //Basiszahl berechnen für weitere Berechnungen
        int baseValue = Math.abs(bookTitle.hashCode());
        //for schleife mit array länge
        for (int i = 0; i < books.length; i++) {
            int pos = (baseValue + i) % books.length;
            //IST STELLE FREI?
            if ((books[pos] == null) || (books[pos].equals(TOMBSTONE))) {
                books[pos] = bookTitle;
                return;
            }
        }
        throw new HashFullException();
    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle) {
        int baseValue = Math.abs(bookTitle.hashCode());
        //for schleife mit array länge
        for (int i = 0; i < books.length; i++) {
            int pos = (baseValue + i) % books.length;
            //IST STELLE FREI?
            if (bookTitle.equals(books[pos]) && books[pos] != null) {
                books[pos] = TOMBSTONE;
                return true;
            }
        }
        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle) {
        int baseValue = Math.abs(bookTitle.hashCode());

        for (int i = 0; i < books.length; i++) {
            int pos = (baseValue + i) % books.length;
            //bei erstem null sind dann keine stellen mehr besetzt im array sind
            if (books[pos] == null) {
                return false;
            }
            //IST STELLE BESETZT?
            else if (bookTitle.equals(books[pos]) && books[pos] != null) {
                return true;
            }
        }
        return false;
    }
}
