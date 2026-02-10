package creational_design_patterns.singleton;

public class NaiveSingleton {

    private static NaiveSingleton instance = null;

    private NaiveSingleton(){}

    public static NaiveSingleton getInstance(){
        if(instance == null){
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
