package behavioural.mediator;

public abstract class User {

    protected Mediator mediator;
    protected String name;
    protected Language language;

    public User(Mediator med, String name, Language language){
        this.mediator=med;
        this.name=name;
        this.language = language;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
