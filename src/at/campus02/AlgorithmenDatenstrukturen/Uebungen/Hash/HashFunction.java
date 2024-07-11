package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Hash;

public class HashFunction {
    private String[] array;
    private static final String TOMPSTONE = "####12345#####++++----";


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

}
