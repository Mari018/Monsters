package Supernatural;
import Supernatural.Interface.Monster.Monster;
import Supernatural.Interface.Strikeable;

public class Witch extends Supernatural implements Strikeable {
    public Witch() {
        this.damage = 25;

    }

    public int getDamage(){
        return damage;
    }

    @Override
    public void damageGiven(Supernatural defender) {
        if (!isDead()) {
            defender.setLife(defender.getLife() - damage);
            System.out.println("Damage " + this.damage);
            System.out.println(defender.getName()  + " " + defender.noLife());

        } else {
            System.out.println("Is dead");
        }
    }



    public boolean isDead () {
        return this.getLife() <= 0;
    }
}