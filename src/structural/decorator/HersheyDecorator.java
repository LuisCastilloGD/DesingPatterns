package structural.decorator;

public class HersheyDecorator extends ChocolateDecorator{
    public HersheyDecorator(Chocolate chocolate) {
        super(chocolate);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Im a Hershey");
    }
}
