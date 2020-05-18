package Model.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    // This class will manage the deck, where the players will be drawing from.

    //Attributes
    private ArrayList<Card> deck = new ArrayList<>();
    private int[] valueofCard = new int[] {1,2,3,4,5};

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
            double random = Math.random();
            if (random <= 0.66){
                deck.add(new Card(value, Card.Effect.MOVE));
            } else if (random > 0.66 && random <= 0.90){
                deck.add(new Card(value, Card.Effect.DRAW));
            }
            else {
                deck.add(new Card(value, Card.Effect.STOP));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

}
