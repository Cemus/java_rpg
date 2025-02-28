import personnages.Assassin;
import personnages.Guerrier;
import personnages.Personnage;

public class Main {
    public static void main (String[] args){
        Personnage j1 = new Assassin("XxD4RK 4334331NxX",7,10,2,5);
        Personnage j2 = new Guerrier("Uther",7,5,4,5);

        Partie nouvellePartie = new Partie(j1,j2,5);
        System.out.println("Start");
        nouvellePartie.lancerPartie();
    }
}
