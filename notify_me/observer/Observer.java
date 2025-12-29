package notify_me.observer;

public interface Observer {
    void update();
    String getNotificationMethod();
    String getUserId();
}
