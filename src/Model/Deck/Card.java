package Model.Deck;

public class Card {
    enum Effect {
        MOVE, STOP, DRAW
    }

    private Effect effect;

    //Attributes
    private int value;

    public Card(int value, Effect effect){
        this.value = value;
        this.effect = effect;
    }

    //Getters
    public int getValue(){
        return this.value;
    }
}
