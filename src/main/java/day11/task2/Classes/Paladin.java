package day11.task2.Classes;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {
    private final int SELFHEAL = 25;
    private final int MATEHEAL = 10;

    public Paladin() {
        setPhysDef(0.5);
        setPhysAtt(15);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
       /* if (getHealth() + SELFHEAL > 100) {
            setHealth(100);
        } else {*/
        setHealth(getHealth() + SELFHEAL);
        //}
    }

    @Override
    public void healTeammate(Hero hero) {
        /*if (hero.getHealth() + MATEHEAL > 100) {
            hero.setHealth(100);
        } else {*/
        hero.setHealth(getHealth() + MATEHEAL);
        //}
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
