package creational.abstract_factory;

public class TractorFactory implements ToyFactory{
    private String brand;
    private int price;
    private String type;

    public TractorFactory(String brand, int price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    @Override
    public Toy createToy() {
        return new Tractor(brand,price,type);
    }
}
