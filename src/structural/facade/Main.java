package structural.facade;

public class Main {
    public static void main(String[] args){
        ReallyOldControllerFacade rolcf = new ReallyOldControllerFacade();

        rolcf.turnOn();
        rolcf.downChannel();
        rolcf.turnOff();

    }
}
