package notify_me.observable;

import notify_me.observer.Observer;

public interface StockObservable {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
    boolean purchase(int qty);
    void restock(int qty);
}
