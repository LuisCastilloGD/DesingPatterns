package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {


        Toy toy = ToysFactory.getToy(new SuperHeroFactory("Mattel",250,"kids"));

        Toy toy2 = ToysFactory.getToy(new TractorFactory("Fisher Price",350,"kids"));

        System.out.println("AbstractFactory superhero Config::"+toy);
        System.out.println("AbstractFactory tractor Config::"+toy2);

    }
}