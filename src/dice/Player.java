package dice;

public class Player {
    private final String name;
    private int rollValue;
    private final Die die;
    private final Cup cup;

    public Player(String name, Die die, Cup cup){
        this.name = name;
        this.die = die;
        this.cup = cup;
    }

    public Player throwDie(){
        setRollValue(this.die.roll().getScore());
        return this;
    }

    public Player throwCup(){
        setRollValue(this.cup.throwCup().getScore());
        return this;
    }

    public String getName() {
        return name;
    }


    public int getRollValue() {
        return rollValue;
    }

    public void setRollValue(int rollValue) {
        this.rollValue = rollValue;
    }

    public Die getDie() {
        return die;
    }

    public Cup getCup() {
        return cup;
    }
}
