package structural.decorator;

public class Main {
    public static void main(String[] args){

        Chocolate chocolate = new DefaultChocolate();

        ChocolateDecorator decorator = new HersheyDecorator(new AlmondDecorator(chocolate));

        decorator.getDescription();

        ChocolateDecorator decorator1 = new AlmondDecorator(new HersheyDecorator(chocolate));

        decorator1.getDescription();

    }
}
