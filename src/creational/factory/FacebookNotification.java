package creational.factory;

public class FacebookNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Send facebook notification");
    }
}
