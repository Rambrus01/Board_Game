package Model.Deck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // This class will manage the deck, where the players will be drawing from.

    //Attributes
    private ArrayList<Card> deck = new ArrayList<>();
    private int[] valueofCard = new int[] {1,2};

    public Deck() {
        this.createDeck();
        this.shuffleDeck();
    }

    //Getters
    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public void createDeck() {
        // Cards are getting value here.
        for (int value : valueofCard) {
            deck.add(new Card(value));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

}
