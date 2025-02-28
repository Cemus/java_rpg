package dice;


public class Die {
    private final int maxFaces;
    private int score;

    public Die(int maxFaces){
        this.maxFaces = maxFaces;
    }
    public Die roll(){
        setScore((int)(Math.random() * maxFaces) + 1);
        return this;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaxFaces() {
        return maxFaces;
    }
}
