package at.campus02.AlgorithmenDatenstrukturen.Sort.UE06_Wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
        //INSERTION SORT
        for (int i = 1; i < presents.length; i++) {
            //für Vergleiche
            for (int j = i; j >0 ; j--) {
                if(presents[j].desire<presents[j-1].desire){
                    Present temp=presents[j];
                    presents[j]=presents[j-1];
                    presents[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        //BUBBLE SORT
        boolean swapped= false;
        for (int i = 0; i < presents.length-1; i++) {
            //für Vergleiche
            for (int j = 0; j < presents.length-1-i; j++) {
                if(presents[j].desire<presents[j+1].desire){
                    Present temp=presents[j];
                    presents[j]=presents[j+1];
                    presents[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
