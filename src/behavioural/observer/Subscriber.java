package behavioural.observer;

public class Subscriber implements Observer{
    protected String name;
    public Subscriber(String name) {
        super();
        this.name = name;
    }
    @Override
    public void notification(String from, String email) {
        System.out.printf("%s received news: %s - NEWS: '%s'\n",name, from, email);
    }
}
