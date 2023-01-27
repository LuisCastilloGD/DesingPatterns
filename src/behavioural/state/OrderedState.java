package behavioural.state;

public class OrderedState implements OrderState{
    @Override
    public void next(Order ord) {
        ord.setState(new SentState());
    }

    @Override
    public void previous(Order ord) {
        System.out.println("This has no previous state");
    }



    @Override
    public void status() {
        System.out.println("Order was ordered waiting to send");
    }
}
