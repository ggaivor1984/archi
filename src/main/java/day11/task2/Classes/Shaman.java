package day11.task2.Classes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    int magicAtt = 15;
    private final int SELFHEAL = 50;
    private final int MATEHEAL = 30;


    public Shaman() {
        setPhysAtt(10);
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        /*if (getHealth() + SELFHEAL > 100) {
            setHealth(100);
        } else {*/
        setHealth(getHealth() + SELFHEAL);
        // }
    }

    @Override
    public void healTeammate(Hero hero) {
        /*if (hero.getHealth() + MATEHEAL > 100) {
            hero.setHealth(100);
        } else {*/
        hero.setHealth(getHealth() + MATEHEAL);
        // }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackEffect = magicAtt * (1 - hero.getMagicDef());
        /*if (hero.getHealth() - attackEffect < 0) {
            hero.setHealth(0);
        } else {*/
        hero.setHealth(getHealth() - (int) attackEffect);
        //}
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
