package structural.facade;

public class UniversalController implements ControllerFacade{


    public void volumeUp(){
        System.out.println("volume up");
    };
    public void volumeDown(){
        System.out.println("volume down");
    }

    public void upChannel(){
        System.out.println("adding one chanel");
    }
    public void downChannel(){
        System.out.println("resting one chanel");
    }

    public void setChanel(int i){
        System.out.println("Setting the "+i+" channel");
    }

    public void turnOn(){
        System.out.println("turning on");
    }
    public void turnOff(){
        System.out.println("turning off");
    }

    public void bootNetflix(){
        System.out.println("booting up Netflix");
    }

}
