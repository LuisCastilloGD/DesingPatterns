package behavioural.state;

public interface OrderState {

    void next(Order ord);
    void previous(Order ord);
    void status();
}
