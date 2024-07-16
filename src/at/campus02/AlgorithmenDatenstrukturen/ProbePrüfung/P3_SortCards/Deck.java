package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P3_SortCards;

public class Deck {
    private Card[] deck;
    private int cardCount;

    public Deck(int arraySize) {
        this.deck = new Card[arraySize];
        cardCount = 0;
    }

    public boolean addCard(Card.Color color, int number) {
        Card newCard = new Card(color, number);
        if (cardCount == deck.length)
            return false;
        else {
            deck[cardCount] = newCard;
            cardCount = cardCount + 1;
            return true;
        }
    }

    public Card[] getDeck() {
        return this.deck;
    }

    public void sortDeck() {
        // TODO: Implementierung hinzufuegen
        for (int i = 1; i < cardCount; i++) {
            for (int j = i; j >0; j--) {
                if (deck[j].getColor().compareTo(deck[j-1].getColor()) < 0){
                    Card temp = deck[j];
                    deck[j] = deck[j-1];
                    deck[j-1] = temp;
                }
                //wenn die farbe ist gleich, aber die nummer nicht
                else if ((deck[j].getColor().compareTo(deck[j-1].getColor()) ==0) &&
                (deck[j].getNumber() < deck[j-1].getNumber())){
                    Card temp = deck[j];
                    deck[j] = deck[j-1];
                    deck[j-1] = temp;
                } else{
                    break;
                }
            }
        }
    }
}
