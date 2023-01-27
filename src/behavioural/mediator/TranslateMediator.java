package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class TranslateMediator implements Mediator{

    private List<User> users;
    public TranslateMediator(){
        this.users=new ArrayList<>();
    }

    @Override
    public void sendMsg(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            //could handle translation in the language of the receiver
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
