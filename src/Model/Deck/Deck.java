package Model.Deck;

import java.util.ArrayList;

public class Deck {
    // This class will manage the deck, where the players will be drawing from.

    //Attributes
    private ArrayList<Card> deck = new ArrayList<>();
    private int[] valueofCard = new int[] {1,2};

    public Deck() {
        this.createDeck();
    }

    //Getters
    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public void createDeck() {
        for (int index = 0; index < valueofCard.length; index++) {
            deck.add(new Card(valueofCard[index]));
        }
    }

}
