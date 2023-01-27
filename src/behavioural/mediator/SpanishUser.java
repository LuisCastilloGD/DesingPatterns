package behavioural.mediator;

public class SpanishUser extends User{
    public SpanishUser(Mediator med, String name) {
        super(med, name, Language.SPANISH);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Mandando mensaje="+msg);
        mediator.sendMsg(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Recibo el mesaje:"+msg);
    }
}
