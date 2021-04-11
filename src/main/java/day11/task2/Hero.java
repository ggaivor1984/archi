package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    //int magicAtt;

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double attackEffect = physAtt * (1 - hero.physDef);
        if (hero.health - attackEffect < 0) {
            hero.health = 0;
        } else {
            hero.health -= attackEffect;
        }
    }
}
