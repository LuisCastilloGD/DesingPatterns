package structural.decorator;

public class DefaultChocolate implements Chocolate{
    @Override
    public void getDescription() {
        System.out.println("Chocolate : ");
    }
}
