package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P3_Discount;

public class Sorter {
    public void sortInvoice(InvoicePosition[] invoice) {
        //BUBBLE SORT
        boolean swapped =false;
        for (int i = 0; i < invoice.length-1; i++) {
            for (int j = 0; j < invoice.length - i - 1; j++) {
                if (invoice[j].getAmount() > invoice[j + 1].getAmount()) {
                    InvoicePosition temp = invoice[j];
                    invoice[j]=invoice[j+1];
                    invoice[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        //INSERTION SORT
        for (int i = 0; i < invoice.length; i++) {
            for (int j = i; j >0 ; j--) {
          if(invoice[j].getAmount()<invoice[j-1].getAmount()){
              InvoicePosition temp=invoice[j];
              invoice[j]=invoice[j-1];
              invoice[j-1]=temp;
          }
            }
        }
    }


}
