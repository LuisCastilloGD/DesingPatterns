package creational.abstract_factory;

public abstract class Toy {

    public abstract String getBrand();
    public abstract int getPrice();
    public abstract String getType();

    @Override
    public String toString(){
        return "Brand= "+this.getBrand()+", Price="+this.getPrice()+", Type="+this.getType();
    }
}
