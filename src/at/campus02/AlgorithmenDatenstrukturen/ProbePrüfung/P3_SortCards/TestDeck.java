package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P3_SortCards;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDeck {

    @Test
    public void testTwoCardsWithSameColorBiggerNumber() {
        Deck deck = new Deck(2);
        // Gelb ist gleich gelb (0)
        System.out.println("Gelb/Gelb-Vergleich: " + Card.Color.YELLOW.compareTo(Card.Color.YELLOW));

        deck.addCard(Card.Color.YELLOW, 4);
        deck.addCard(Card.Color.YELLOW, 2);

        deck.sortDeck();
        assertEquals(2, deck.getDeck()[0].getNumber());
        assertEquals(4, deck.getDeck()[1].getNumber());
    }

    @Test
    public void testTwoCardsWithBiggerColorSmallerNumber()
    {
        Deck deck = new Deck(2);
        // Blau ist größer als Gelb (+1)
        System.out.println("Blau/Gelb-Vergleich: " + Card.Color.BLUE.compareTo(Card.Color.YELLOW));

        deck.addCard(Card.Color.GREEN, 1);
        deck.addCard(Card.Color.RED, 5);

        deck.sortDeck();
        assertEquals(5, deck.getDeck()[0].getNumber());
        assertEquals(1, deck.getDeck()[1].getNumber());
    }

    @Test
    public void testTwoCardsWithBiggerColorSameNumber() {
        Deck deck = new Deck(2);
        // Blau ist größer als Gelb (+1)
        System.out.println("Blau/Gelb-Vergleich: " + Card.Color.BLUE.compareTo(Card.Color.YELLOW));

        deck.addCard(Card.Color.BLUE, 4);
        deck.addCard(Card.Color.YELLOW, 4);

        deck.sortDeck();
        assertEquals(Card.Color.YELLOW, deck.getDeck()[0].getColor());
        assertEquals(Card.Color.BLUE, deck.getDeck()[1].getColor());
    }

    @Test
    public void testThreeCardsWithSmallerColorBiggerNumber() {
        Deck deck = new Deck(3);
        // Blau ist kleiner grün (-1)
        System.out.println("Blau/Grün-Vergleich: " + Card.Color.BLUE.compareTo(Card.Color.GREEN));

        deck.addCard(Card.Color.BLUE, 7);
        deck.addCard(Card.Color.BLUE, 4);
        deck.addCard(Card.Color.GREEN, 3);

        deck.sortDeck();
        assertEquals(4, deck.getDeck()[0].getNumber());
        assertEquals(3, deck.getDeck()[2].getNumber());
    }

    @Test
    public void testMultipleCards()
    {
        Deck deck = new Deck(6);

        deck.addCard(Card.Color.GREEN, 8);
        deck.addCard(Card.Color.BLUE, 5);
        deck.addCard(Card.Color.RED, 1);
        deck.addCard(Card.Color.YELLOW, 4);
        deck.addCard(Card.Color.RED, 7);
        deck.addCard(Card.Color.BLUE, 2);
        deck.sortDeck();

        assertEquals(1, deck.getDeck()[0].getNumber());
        assertEquals(7, deck.getDeck()[1].getNumber());
        assertEquals(4, deck.getDeck()[2].getNumber());
        assertEquals(2, deck.getDeck()[3].getNumber());
        assertEquals(5, deck.getDeck()[4].getNumber());
        assertEquals(8, deck.getDeck()[5].getNumber());
    }
}
