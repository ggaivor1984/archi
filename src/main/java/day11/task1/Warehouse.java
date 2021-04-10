package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return "Количество собранных заказов: " + countPickedOrders + "," + " Количество доставленных заказов: " + countDeliveredOrders;
    }

    public void incrementPickedOrders(){
        countPickedOrders++;
    }

    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }
}
