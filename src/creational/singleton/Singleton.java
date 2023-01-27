package creational.singleton;

public class Singleton {

    private final static Singleton INSTANCE = new Singleton();

    private Singleton(){
        //Can add lazy-loading
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }

}
