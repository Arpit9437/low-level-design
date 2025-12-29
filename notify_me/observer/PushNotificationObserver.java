package notify_me.observer;

public class PushNotificationObserver implements Observer{
    private final String userId;
    private final String deviceToken;

    public PushNotificationObserver(String userId, String deviceToken){
        this.userId = userId;
        this.deviceToken = deviceToken;
    }

    @Override
    public void update() {
        sendPushNotification();
    }

    public void sendPushNotification(){
        System.out.println("PUSH NOTIFICATION SENT TO: " + deviceToken);
        System.out.println("Product is back in stock! Hurry up!!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
       return userId;
    }
}
