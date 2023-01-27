package creational.abstract_factory;

public class SuperHero extends Toy{
    public SuperHero(String brand, int price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    private String brand;
    private int price;
    private String type;
    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
    }


}
