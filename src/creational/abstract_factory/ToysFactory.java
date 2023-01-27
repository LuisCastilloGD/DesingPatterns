package creational.abstract_factory;

public class ToysFactory {
    public static Toy getToy(ToyFactory factory){
        return factory.createToy();
    }
}
