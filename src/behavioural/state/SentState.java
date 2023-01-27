package behavioural.state;

public class SentState implements OrderState{


    @Override
    public void next(Order ord) {
        ord.setState(new ReceivedState());
    }

    @Override
    public void previous(Order ord) {
        ord.setState(new OrderedState());
    }

    @Override
    public void status() {
        System.out.println("Order sent waiting to be received");
    }
}
