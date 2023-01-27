package creational.abstract_factory;

public class Tractor extends Toy{
    private String brand;
    private int price;
    private String type;
    public Tractor(String brand, int price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }


}
