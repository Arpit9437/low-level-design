package notify_me.observer;

public class EmailNotificationObserver implements Observer{
    private final String userId;
    private final String emailId;

    public EmailNotificationObserver(String userId, String emailId){
        this.userId = userId;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("EMAIL SENT TO: " + emailId);
        System.out.println("Product is back in stock! Hurry up!!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Email";
    }

    @Override
    public String getUserId() {
       return userId;
    }
}
