package dice;

public class Game {
    private final Player J1;
    private final Player J2;
    private final int maxRound;
    private int scoreJ1;
    private int scoreJ2;

    public Game(Player J1, Player J2, int maxRound){
        this.J1 = J1;
        this.J2 = J2;
        this.maxRound = maxRound;
        scoreJ1 = 0;
        scoreJ2 = 0;
    }

    public void start(){
        final String j1 = J1.getName();
        final String j2 = J2.getName();

        for (int i = 0; i < maxRound; i++){
            System.out.println("\n### Tour " + i + " / " + maxRound + " ###");
            drawScore();
            System.out.println(j1 + " et " + j2 + " lancent les dés...");
            int tempJ1Score = J1.throwDie().getRollValue();
            int tempJ2Score = J2.throwDie().getRollValue();
            System.out.println(".");
            System.out.println("..");
            System.out.println("...");
            System.out.println(j1 + " a fait : " + tempJ1Score + " !");
            System.out.println(j2 + " a fait : " + tempJ2Score + " !");
            if (tempJ1Score == 1){
                System.out.println(j1 + " lance la coupe !");
                tempJ1Score = J1.throwCup().getRollValue();
                System.out.println(j1 + " a fait : " + tempJ1Score + " !");
            }
            if (tempJ2Score == 1){
                System.out.println(j2 + " lance la coupe !");
                tempJ2Score = J2.throwCup().getRollValue();
                System.out.println(j2 + " a fait : " + tempJ2Score + " !");
            }

            if (tempJ1Score > tempJ2Score){
                setScoreJ1(scoreJ1 + 2);
                System.out.println(j1 + " ajoute deux points à son score !");
            }else if (tempJ2Score > tempJ1Score){
                setScoreJ2(scoreJ2 + 2);
                System.out.println(j2 + " ajoute deux points à son score !");
            }else{
                setScoreJ1(scoreJ1 + 1);
                setScoreJ2(scoreJ2 + 1);
                System.out.println(j1 + " et " + j2 + " ajoutent 1 point à leur score !");
            }
        }
        end();
    }

    public void end(){
        System.out.println("\n### Tour " + maxRound + " ###");
        drawScore();
        if (scoreJ1 > scoreJ2){
            System.out.println(J1.getName() + " a gagné !");
        } else if (scoreJ2 > scoreJ1){
            System.out.println(J2.getName() + " a gagné !");
        }else{
            System.out.println("Egalité !");
        }
    }

    public void drawScore(){
        System.out.println("### Scores ###");
        System.out.println(J1.getName() + " : " + scoreJ1 + " points.");
        System.out.println(J2.getName() + " : " + scoreJ2 + " points.");
        System.out.println("### ###### ###\n");
    }

    public Player getJ1() {
        return J1;
    }



    public Player getJ2() {
        return J2;
    }



    public int getRound() {
        return maxRound;
    }



    public int getScoreJ1() {
        return scoreJ1;
    }

    public void setScoreJ1(int scoreJ1) {
        this.scoreJ1 = scoreJ1;
    }

    public int getScoreJ2() {
        return scoreJ2;
    }

    public void setScoreJ2(int scoreJ2) {
        this.scoreJ2 = scoreJ2;
    }
}
