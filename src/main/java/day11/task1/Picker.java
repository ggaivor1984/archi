package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker salary= " + salary + ", isPayed= " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 70000;
            isPayed = true;
        }
    }
}
