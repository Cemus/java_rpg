package dice;

import java.util.ArrayList;
import java.util.List;

public class Cup {
    List<Die> dice;
    private int score;

    public Cup(Die firstDie, Die secondDie, Die thirdDie){
        this.dice = new ArrayList<Die>();
        dice.add(firstDie);
        dice.add(secondDie);
        dice.add(thirdDie);
    }

    public Cup throwCup(){
        int score = 0;
        for (Die die : dice){
            int roll = die.roll().getScore();
            score += roll;
            System.out.println(roll + " !");
        }
        setScore(score);
        return this;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
