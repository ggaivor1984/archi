package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;


    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Courier salary= " + salary + ", isPayed= " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 50000;
            isPayed = true;
        }

    }
}

