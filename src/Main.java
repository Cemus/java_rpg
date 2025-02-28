import dice.Cup;
import dice.Die;
import dice.Game;
import dice.Player;

public class Main {
    public static void main (String[] args){
        // Si un joueur fait un, il lance la coupe de dés !
        Die die = new Die(6);
        Game diceGame = new Game(new Player("jean", die, new Cup(die,die,die)), new Player("paulette", die, new Cup (die,die,die)), 10);
        diceGame.start();
    }
}
