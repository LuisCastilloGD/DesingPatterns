package creational.factory;

public class Main {
    public static void main(String[] args) {

            NotificationFactory factory = new NotificationFactory();
            Notification notification = factory.createNotification(Medium.EMAIL);
            notification.notifyUser();

    }
}