package creational_design_patterns.singleton;

public class Main {
    public static void main(String[] args){
        
        // NaiveSingleton obj1 = NaiveSingleton.getInstance();
        // NaiveSingleton obj2 = NaiveSingleton.getInstance();
        // System.out.println("Object 1: " + obj1.toString());
        // System.out.println("Object 2: " + obj2.toString());

        // EagerSingleton eobj1 = EagerSingleton.getInstance();
        // EagerSingleton eobj2 = EagerSingleton.getInstance();
        // System.out.println("EObject 1: " + eobj1.toString());
        // System.out.println("EObject 2: " + eobj2.toString());

        //multithreaded naive singleton demo
        // Thread thread1 = new Thread(new Thread1());
        // Thread thread2 = new Thread(new Thread2());
        // thread1.start();
        // thread2.start();

        //multithreaded thread safe singleton demo
        Thread thread3 = new Thread(new Thread3());
        Thread thread4 = new Thread(new Thread4());
        thread3.start();
        thread4.start();

    }

    public static class Thread1 implements Runnable{
        
        @Override
        public void run(){
            System.out.println("Thread 1.");
            NaiveSingleton ns = NaiveSingleton.getInstance();
            System.out.println("Thread 1 object : " + ns.toString());
        }
    }

    public static class Thread2 implements Runnable{
        
        @Override
        public void run(){
            System.out.println("Thread 2.");
            NaiveSingleton ns = NaiveSingleton.getInstance();
            System.out.println("Thread 2 object : " + ns.toString());
        }
    }

    public static class Thread3 implements Runnable{
        
        @Override
        public void run(){
            System.out.println("Thread 3.");
            ThreadSafeSingleton ths = ThreadSafeSingleton.getInstance();
            System.out.println("Thread 3 object : " + ths.toString());
        }
    }

    public static class Thread4 implements Runnable{
        
        @Override
        public void run(){
            System.out.println("Thread 4.");
            ThreadSafeSingleton ths = ThreadSafeSingleton.getInstance();
            System.out.println("Thread 4 object : " + ths.toString());
        }
    }
}
