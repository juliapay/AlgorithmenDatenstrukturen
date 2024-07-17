package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Hash;

import at.campus02.AlgorithmenDatenstrukturen.Hashtable.UE05_LibraryHashWithList.Book;

import java.util.Iterator;
import java.util.LinkedList;

public class HashFunktionMitListe {
    //HASHTABLE MIT LISTE

    private LinkedList<Book>[] list;
    public HashFunktionMitListe(int size) {
        list=new LinkedList[size];
    }
    //HASHTABLE ADD MIT LISTE
    public boolean addObject(Book newBook)
    {
        int listIndex= getIndexByHashCalc(newBook.getId());
        if(list[listIndex]==null){
            list[listIndex]=new LinkedList<Book>();
        }
        return list[listIndex].add(newBook);
    }
    //HASHTABLE SEARCH MIT LISTE
    public Book getBookById(int id)
    {
        Book currentBook;
        LinkedList<Book> linkedList = list[getIndexByHashCalc(id)];
        Iterator it = linkedList.iterator();
        while (it.hasNext())
        {
            currentBook = (Book)it.next();
            if (currentBook.getId() == id)
                return currentBook;
        }

        return null;
    }
    //HASHTABLE REMOVE MIT LISTE
    public boolean removeBook(int id)
    {
        Book book = getBookById(id);
        if (book == null)
            return false;

        int listIndex = getIndexByHashCalc(book.getId());
        LinkedList<Book> linkedList = list[listIndex];
        return linkedList.remove(book);
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
