package at.campus02.AlgorithmenDatenstrukturen.Hashtable.UE05_LibraryHashWithList;

import java.util.Iterator;
import java.util.LinkedList;

public class LibraryHashWithList {
    // TODO: Liste, die je Position aus einer LinkedList besteht
    private LinkedList<Book>[] list;

    public LibraryHashWithList(int size) {
        list=new LinkedList[size];
    }

    public boolean addBook(Book newBook)
    {
        int listIndex= getIndexByHashCalc(newBook.getId());
        if(list[listIndex]==null){
            list[listIndex]=new LinkedList<Book>();
        }
        list[listIndex].add(newBook);
        return true;
    }

    public Book getBookById(int id)
    {

        // Tipp: Beim Durchsuchen der LinkedList könnte ein Iterator hilfreich sein.
        return null;
    }

    public boolean removeBook(int id)
    {
        // TODO: Implementieren
        return false;
    }

    public LinkedList<Book> getLinkedListAtPos(int pos)
    {

        return list[pos];

    }

    private int getIndexByHashCalc(int id)
    {

        return id % list.length;

    }
}
