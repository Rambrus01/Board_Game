package Model.Player;

public class Player {

    // The player should have a position, should be able to change its position.

    // This variable saves the players current position on a line based board,
    private int positionOfPlayer = 1;

    public Player() {

    }

    public void changePlayersPosition(){
        int dice = (int)(Math.random() * 6 + 1);
        System.out.println(positionOfPlayer);
        System.out.println(dice);
        positionOfPlayer = positionOfPlayer + dice;
        System.out.println(positionOfPlayer);
    }

    public int getPositionOfPlayer() {
        return this.positionOfPlayer;
    }
}
