package behavioural.mediator;

public class RussianUser extends User{
    public RussianUser(Mediator med, String name) {
        super(med, name, Language.RUSSIAN);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": отправленное сообщение ="+msg);
        mediator.sendMsg(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": полученное сообщение:"+msg);
    }
}
