package creational_design_patterns.singleton;

public class DoubleCheckingThreadSafeSingleton {

    private static volatile DoubleCheckingThreadSafeSingleton instance;

    private DoubleCheckingThreadSafeSingleton(){}

    public static DoubleCheckingThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized(DoubleCheckingThreadSafeSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckingThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
