package notify_me;

import notify_me.observable.IphoneStockObservable;
import notify_me.observable.StockObservable;
import notify_me.observer.EmailNotificationObserver;
import notify_me.observer.Observer;
import notify_me.observer.PushNotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneStockObservable("ip17s", "IPhone17", 100, 0);
        Observer obs1 = new EmailNotificationObserver("12a3", "abc@gmail.com");
        Observer obs2 = new PushNotificationObserver("23b4", "abcef45");
        iphone.addObserver(obs1);
        iphone.addObserver(obs2);
        iphone.purchase(2);
        iphone.restock(10);
    }
}
