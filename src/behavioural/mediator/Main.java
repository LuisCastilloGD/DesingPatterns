package behavioural.mediator;

public class Main {

    public static void main(String[] args){

        Mediator mediator = new TranslateMediator();
        User user1 = new SpanishUser(mediator, "Pankaj");
        User user2 = new SpanishUser(mediator, "Lisa");
        User user3 = new EnglishUser(mediator, "Saurabh");
        User user4 = new RussianUser(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");



    }

}
