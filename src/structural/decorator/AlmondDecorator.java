package structural.decorator;

public class AlmondDecorator extends ChocolateDecorator{


    public AlmondDecorator(Chocolate chocolate) {
        super(chocolate);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("I have almonds");
    }
}
