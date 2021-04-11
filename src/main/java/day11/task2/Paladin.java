package day11.task2;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        setPhysDef(0.5);
        setPhysAtt(15);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        if (getHealth() + 25 > 100) {
            setHealth(100);
        } else {
            setHealth(getHealth() + 25);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 10 > 100) {
            hero.setHealth(100);
        } else {
            hero.setHealth(getHealth() + 10);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
