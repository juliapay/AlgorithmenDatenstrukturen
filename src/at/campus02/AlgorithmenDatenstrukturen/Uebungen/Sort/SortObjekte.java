package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Sort;

public class SortObjekte {
    public void sortObjektePerNumberInsertion(Objekt[] objekts){
        //INSERTION SORT

        for (int i = 0; i <objekts.length ; i++) {

            for (int j = i; j >0 ; j--) {
                if(objekts[j].getNumber()<objekts[j-1].getNumber()){
                    Objekt temp=objekts[j];
                    objekts[j]=objekts[j-1];
                    objekts[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }
    public void sortObjektPerNumberBubble(Objekt[] objekts){
        // BUBBLE SORT

        boolean swapped=false;
        for (int i = 0; i < objekts.length-1; i++) {

            for (int j = 0; j < objekts.length-1-i; j++) {
                if(objekts[j].getNumber()>objekts[j+1].getNumber()){
                    Objekt temp = objekts[j];
                    objekts[j]=objekts[j+1];
                    objekts[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
