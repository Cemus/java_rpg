package dice;

public class Player {
    private final String name;
    private int rollValue;
    private final Die die;

    public Player(String name, Die die){
        this.name = name;
        this.die = die;
    }

    public Player throwDie(){
        setRollValue(this.die.roll().getScore());
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

}
