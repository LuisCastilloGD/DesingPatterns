package structural.facade;

public class OldTVFacade implements  ControllerFacade{
    UniversalController controller;

    public OldTVFacade() {
        UniversalController controller = new UniversalController();
        this.controller = controller;
    }

    public void turnOn(){
        controller.turnOn();
    }
    public void turnOff(){
        controller.turnOff();
    }

    public void downChannel(){
        controller.downChannel();
    }

    public void setChanel(int i){
        controller.setChanel(i);
    }
    public void upChannel(){
        controller.upChannel();
    }


}
