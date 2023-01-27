package structural.decorator;

public class ChocolateDecorator implements Chocolate{

    protected Chocolate chocolate;

    public ChocolateDecorator(Chocolate chocolate){
        this.chocolate=chocolate;
    }

    @Override
    public void getDescription() {
        this.chocolate.getDescription();
    }
}
