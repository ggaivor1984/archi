package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        setPhysDef(0.8);
        setPhysAtt(30);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
