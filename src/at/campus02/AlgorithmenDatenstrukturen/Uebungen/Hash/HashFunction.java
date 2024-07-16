package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Hash;

import java.util.LinkedList;

public class HashFunction {
    private String[] array;
    private LinkedList<String>[] list;

    private static final String TOMPSTONE = "####12345#####++++----";

    //HASHCODE ADD LINEAR
    public void add(String letters) {
        int baseValue = Math.abs(letters.hashCode());

        for (int i = 0; i < array.length; i++) {
            //h1 = wert+i % arraylänge
            int pos = (baseValue + i) % array.length;

            if (array[pos] == null || array[pos].equals(TOMPSTONE)) {

                array[pos] = letters;

                return;
            }
        }
    }
    //HASHCODE REMOVE LINEAR
    public boolean remove(String letters) {
        int baseValue = Math.abs(letters.hashCode());
        for (int i = 0; i < array.length; i++) {
            int pos = (baseValue + i) % array.length;
            if (array[pos].equals(letters) && array[pos] != null) {
                array[pos] = TOMPSTONE;
                return true;
            }
        }
        return false;
    }
    //HASHCODE SEARCH LINEAR
    public boolean isElementInArray(String letters) {
        int baseValue = Math.abs(letters.hashCode());
        for (int i = 0; i < array.length; i++) {

            int pos = (baseValue + i) % array.length;
            if (array[pos] == null) {
                return false;
            }
            if (array[pos].equals(letters) && array[pos] != null) {
                return true;
            }
        }
        return false;
    }
    //HASHCODE ADD DOUBLEHASHING
    public void addWithDoubleHashing(String letters) {

        int baseValue = Math.abs(letters.hashCode());

        int h1 = baseValue % array.length;
        int h2 = baseValue % 31 + 13;

        for (int i = 0; i < array.length; i++) {

            int pos = (h1 + (i * h2)) % array.length;

            if (array[pos].equals(TOMPSTONE) || array[pos] == null) {

                array[pos] = letters;
            }
        }

    }
    //HASHCODE REMOVE DOUBLEHASHING
    public boolean removeWithDoubleHashing(String letters) {

        int baseValue = Math.abs(letters.hashCode());

        int h1 = baseValue % array.length;
        int h2 = baseValue % 31 + 13;

        for (int i = 0; i < array.length; i++) {
            int pos = (h1 + (i * h2)) % array.length;
            if ((letters.equals(array[pos])) && (array[pos] != null)) {
                array[pos] = TOMPSTONE;
                return true;
            }
        }
        return false;
    }
    //HASHCODE SEARCH DOUBLEHASHING
    public boolean isElementInArrayWithDoubleHashing(String letters){
        int baseValue=Math.abs(letters.hashCode());
        int h1= baseValue% array.length;
        int h2= baseValue%31+13;
        for (int i = 0; i < array.length; i++) {

            int pos =(h1+(i*h2))%array.length;

            if(letters.equals(array[pos])&&array[pos]!=null){
                return true;
            }
        }
        return false;
    }
    public boolean addWithListHashfunction(String element){
        int baseValue= Math.abs(element.hashCode());
        int pos= baseValue%list.length;

        if(list[pos]==null){
            list[pos]=new LinkedList<String>();
        }
        return list[pos].add(element);
    }

}
