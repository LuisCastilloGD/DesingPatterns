package behavioural.state;

public class Order {

    private OrderState state;

    public Order( ){
        this.state = new OrderedState();
    }


    public void setState(OrderState state) {
        this.state = state;
    }

    public void previousState(){
        state.previous(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void getStatus(){
        state.status();
    }

}
