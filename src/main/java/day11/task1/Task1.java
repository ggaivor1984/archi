package day11.task1;

public class Task1 {
    public static void main(String[] args) {
    Warehouse wareHouse1 = new Warehouse();
    Picker picker1 = new Picker(wareHouse1);
    Courier courier1 = new Courier(wareHouse1);
    businessProcess(picker1);
    businessProcess(courier1);

        System.out.println(wareHouse1);
        System.out.println(picker1);
        System.out.println(courier1);
        Warehouse wareHouse2 = new Warehouse();
        Picker picker2 = new Picker(wareHouse2);
        Courier courier2 = new Courier(wareHouse2);
        picker2.doWork();
        courier2.doWork();
        businessProcess(courier1);
        System.out.println();
        System.out.println(wareHouse1);
        System.out.println(picker1);
        System.out.println(courier1);
    }
    static void businessProcess(Worker worker){
        for(int i = 0;i < 10000;i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
