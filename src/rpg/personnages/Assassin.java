package rpg.personnages;
import java.util.Random;

public class Assassin extends Personnage {
    private int bonusAttaque;

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public void attaquer(Personnage cible){
        int degats = 0;
        int bonusDegats = super.getAttaque() + bonusAttaque;

        Random random = new Random();
        int bonusChance = random.nextInt(100);

        if (bonusChance < 5){
            degats = bonusDegats - cible.getDefense();
            System.out.println("C-C-C-C-COUP CRITIQUE DE" + getNom().toUpperCase() +  " !");
        }else{
            degats = super.getAttaque() - cible.getDefense();
        }

        cible.setVie(cible.getVie() - degats);

        System.out.println("Il inflige " + degats + " dégats !");
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }
    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }
}
