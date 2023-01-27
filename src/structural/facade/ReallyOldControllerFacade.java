package structural.facade;

public class ReallyOldControllerFacade implements ControllerFacade{

    OldTVFacade oldController;

    public ReallyOldControllerFacade() {
        OldTVFacade oldController = new OldTVFacade();
        this.oldController = oldController;
    }

    public void turnOn(){
        oldController.turnOn();
    }
    public void turnOff(){
        oldController.turnOff();
    }

    public void downChannel(){
        oldController.downChannel();
    }

}
