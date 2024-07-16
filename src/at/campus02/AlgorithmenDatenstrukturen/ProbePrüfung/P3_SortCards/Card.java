package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P3_SortCards;

public class Card {
    public enum Color { RED, YELLOW, BLUE, GREEN };
    private Color color;
    private int number;

    public Card(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
