package notify_me.observable;

import java.util.ArrayList;
import java.util.List;

import notify_me.observer.Observer;

public class IphoneStockObservable implements StockObservable {
    private final String prodId;
    private final String prodName;
    private final double price;
    private int stockQty;
    private final List<Observer> observers;

    public IphoneStockObservable(String prodId, String prodName, double price, int stockQty) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.stockQty = stockQty;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer obs){
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs){
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        if(stockQty > 0 && !observers.isEmpty()) {
            System.out.println("Notifying " + observers.size() + " subscribers.");
            List<Observer> obsToNotify = new ArrayList<>(observers); //avoid concurrent modifications.
            for (Observer obs : obsToNotify) {
                obs.update();
            }
        }
    }

    @Override
    public boolean purchase(int qty){
        if(stockQty >= qty){
            stockQty -= qty;
            System.out.println("PURCHASE SUCCESS: " + qty + " units of " + prodName);
            System.out.println("Remaining stock: " + stockQty);
            return true;
        }
        else{
            System.out.println("PURCHASE FAILED: " + prodName + " out of stock.");
            return false;
        }
    }

    @Override
    public void restock(int qty){
        boolean wasOutOfStock = (stockQty == 0);
        stockQty += qty;
        System.out.println("RESTOCKED: " + prodName);
        System.out.println("Current stock: " + stockQty);
        if(wasOutOfStock && stockQty > 0){
            notifyObservers();
        }
    }

    public String getProdId(){
        return prodId;
    }    

    public String getProdName(){
        return prodName;
    }

    public double getPrice(){
        return price;
    }

    public int getStockQty(){
        return stockQty;
    }

}
