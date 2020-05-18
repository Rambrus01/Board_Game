package Model.Logic;

import Model.Deck.Deck;
import Model.Player.Player;

import java.util.Scanner;

public class Game {

    private Deck deckManager = new Deck();
    private Player playerManager = new Player();
    private Scanner input = new Scanner(System.in);

    public void run (){
        while(true){
            System.out.println("Press r to roll the dice!");
            String hit = input.next();

            if (hit.equals("r")){
                playerManager.changePlayersPosition();
            }
        }

    }
}
