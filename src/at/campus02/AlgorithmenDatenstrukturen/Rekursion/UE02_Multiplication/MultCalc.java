package at.campus02.AlgorithmenDatenstrukturen.Rekursion.UE02_Multiplication;

public class MultCalc {

    public int calcMultiplication(int multiplicand, int multiplier) {
        // Multiplicand = 3 = Wert
        // Multiplier = 4 = Zähler
        if (multiplier == 1) {
            return multiplicand;
        } else {
            return multiplicand + calcMultiplication(multiplicand, multiplier-1);
        }
    }
}
