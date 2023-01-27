package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineSubscription implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    private String namePage;
    private String from;

    public OnlineSubscription(String name){
        super();
        this.namePage = name;
        this.from = "- From: "+name;
    }
    public String getName() {
        return namePage;
    }
    public void setName(String name) {
        this.namePage = name;
    }
    public String getAddress() {
        return from;
    }
    public void sendNews(String news) {
        System.out.printf("\nName: %s, News : %s\n", from, news);
        notifySubscribers(news);
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String email) {
        subscribers.forEach(observer -> observer.notification(from,email));
    }
}
