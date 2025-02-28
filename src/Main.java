import dice.Die;
import dice.Game;
import dice.Player;

public class Main {
    public static void main (String[] args){
        Game diceGame = new Game(new Player("jean", new Die(6)), new Player("paulette", new Die(6)), 10);
        diceGame.start();
    }
}
