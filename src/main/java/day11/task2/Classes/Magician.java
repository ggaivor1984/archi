package day11.task2.Classes;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        setPhysDef(0);
        setMagicDef(0.8);
        setPhysAtt(5);
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackEffect = magicAtt * (1 - hero.getMagicDef());
        /*if (hero.getHealth() - attackEffect < 0) {
            hero.setHealth(0);
        } else {*/
        hero.setHealth(hero.getHealth() - (int) attackEffect);
        //}
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
