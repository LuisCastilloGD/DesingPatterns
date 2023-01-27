package behavioural.mediator;

public class EnglishUser extends  User{

    public EnglishUser(Mediator med, String name) {
        super(med, name, Language.ENGLISH);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sent message="+msg);
        mediator.sendMsg(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received message:"+msg);
    }
}
