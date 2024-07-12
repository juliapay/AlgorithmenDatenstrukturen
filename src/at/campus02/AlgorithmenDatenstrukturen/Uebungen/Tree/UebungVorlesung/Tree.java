package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Tree.UebungVorlesung;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public Book searchPerLoop(int bookId) {
        Node current = root;
        //Fall 1 Baum ist leer
        if (root == null) {
            return null;
        } else {
            while (current!=null) {
                if (current.getBook().getId()==bookId){

                    return current.getBook();
                }
                if(bookId<current.getBook().getId()){

                    current= current.getLeft();

                } else if (bookId>current.getBook().getId()) {

                    current= current.getRight();
                }
            }
        }
        return null;
    }
}
