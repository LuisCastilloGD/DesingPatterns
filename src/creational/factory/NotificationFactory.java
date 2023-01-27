package creational.factory;

public class NotificationFactory{

    public Notification createNotification(Medium medium){
        switch (medium){
            case EMAIL -> {
                return new EmailNotification();
            }
            case FACEBOOK -> {
                return new FacebookNotification();
            }
        }
        return null;
    }


}
