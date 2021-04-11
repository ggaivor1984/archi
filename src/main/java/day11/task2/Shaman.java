package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    int magicAtt = 15;

    public Shaman() {
        setPhysAtt(10);
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        if (getHealth() + 50 > 100) {
            setHealth(100);
        } else {
            setHealth(getHealth() + 50);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30 > 100) {
            hero.setHealth(100);
        } else {
            hero.setHealth(getHealth() + 30);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackEffect = magicAtt * (1 - hero.getMagicDef());
        if (hero.getHealth() - attackEffect < 0) {
            hero.setHealth(0);
        } else {
            hero.setHealth(getHealth() - (int) attackEffect);
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
