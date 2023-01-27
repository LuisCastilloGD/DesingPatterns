package behavioural.state;

public class ReceivedState implements OrderState{


    @Override
    public void next(Order ord) {
        System.out.println("This is the last step");
    }

    @Override
    public void previous(Order ord) {
        ord.setState(new SentState());
    }

    @Override
    public void status() {
        System.out.println("order has been received. done!");
    }
}
