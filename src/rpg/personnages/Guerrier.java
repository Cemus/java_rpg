package rpg.personnages;
import java.util.Random;

public class Guerrier extends Personnage{
        private int bonusDefense;

        public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense){
            super(nom, vie, attaque, defense);
            this.bonusDefense = bonusDefense;
        }

        @Override
        public void attaquer(Personnage cible){
            int degats = 0;
            int bonusSoin = super.getDefense() + bonusDefense;

            Random random = new Random();
            int bonusChance = random.nextInt(100);

            if (bonusChance < 5){
                super.setVie(super.getVie() + bonusSoin);
                System.out.println("Chance soin ! Il gagne " + bonusSoin + " points de vie !");
            }

            degats = super.getAttaque() - cible.getDefense();
            cible.setVie(cible.getVie() - degats);

            System.out.println("Il inflige " + degats + " dégats !");
        }

        public int getBonusDefense() {
            return bonusDefense;
        }
        public void setBonusDefense(int bonusDefense) {
            this.bonusDefense = bonusDefense;
        }
    }
