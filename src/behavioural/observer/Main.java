package behavioural.observer;

public class Main {
    public static void main(String[] args){

        OnlineSubscription n1 = new OnlineSubscription("Amazon");
        Subscriber s1 = new Subscriber("Luis");
        Subscriber s2 = new Subscriber("Hector");
        n1.addSubscriber(s1);
        n1.addSubscriber(s2);
        n1.sendNews("Discounts in the game you wishlist ed!");
        n1.removeSubscriber(s2);
        n1.sendNews("Limited to the first buyers!");

    }

}
