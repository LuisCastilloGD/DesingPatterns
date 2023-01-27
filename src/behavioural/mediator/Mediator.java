package behavioural.mediator;

public interface Mediator {

    void sendMsg(String msg, User user);
    void addUser(User user);

}
