package day15;

public class Shoes {
    private String shoesName;
    private int size;
    private int quantity;

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoesName='" + shoesName + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }
}
