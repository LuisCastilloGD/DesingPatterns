package creational.abstract_factory;

public class SuperHeroFactory implements ToyFactory{

    private String brand;
    private int price;
    private String type;

    public SuperHeroFactory(String brand, int price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    @Override
    public Toy createToy() {
        return new SuperHero(brand,price,type);
    }
}
