import personnages.Personnage;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbTour;

    Partie(Personnage joueur1, Personnage joueur2, int nbTour){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbTour = nbTour;
    }

    public void lancerPartie(){
        while (nbTour > 0){
            System.out.println("\n### TOURS RESTANT : " + nbTour + " ###");
            System.out.println(joueur1.getNom() + " : " + joueur1.getVie() + " HP");
            System.out.println(joueur2.getNom() + " : " + joueur2.getVie() + " HP");
            System.out.println("######");

            System.out.println(joueur1.getNom() + " attaque !");
            joueur1.attaquer(joueur2);
            System.out.println(joueur2.getNom() + " attaque !");
            joueur2.attaquer(joueur1);

            nbTour--;

            if (joueur1.getVie() <= 0 && joueur2.getVie() <= 0){
                finJeu();
                return;
            }
            if (joueur1.getVie() <= 0){
                finJeu(joueur2);
                return;
            }
            if (joueur2.getVie() <= 0){
                finJeu(joueur1);
                return;
            }
        }
        finJeu();
    }

    public String finJeu(Personnage gagnant){
        System.out.println("\n### FIN DU DUEL ###");
        System.out.println(gagnant.getNom() + " a gagné !");
        System.out.println("### ########### ###");
        return gagnant.getNom();
    }

    public String finJeu(){
        System.out.println("\n### FIN DU DUEL ###");
        System.out.println("Egalité !");
        System.out.println("### ########### ###");
        return "Egalité";
    }

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }
}
