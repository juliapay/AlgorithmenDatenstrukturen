package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree.UebungVorlesung;

public class SaerchMitRekursion {
    private Node root;

    public Book search(int bookId) {
        return searchRecusive(root, bookId);
    }

    public Book searchRecusive(Node current, int bookId) {

        if (current == null)
            return null;

        else if (bookId == current.getBook().getId())
            return current.getBook();

        else if (bookId < current.getBook().getId())
            return searchRecusive(current.getLeft(), bookId);

        else
            return searchRecusive(current.getRight(), bookId);

    }
}
