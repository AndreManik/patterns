package patternsP.singleton;

public class SingletoneApp {
    public static void main(String[] args) throws InterruptedException {
        int SIZE = 1000;
        Thread[] thread = new Thread[SIZE];
        for(int i = 0; i < SIZE; i++) {
            thread[i] = new Thread(new Run());
            thread[i].start();
        }

        for (int i = 0; i < SIZE; i++) {
            thread[i].join();
        }
        System.out.println(Singletone.counter);
    }
}
class Run implements Runnable {
    private static int count = 0;
    @Override
    public void run() {
        count++;
        System.out.println("new Thead is runnting " + count);
        Singletone.getInstance();
    }
}
class Singletone {
    public static int counter = 0 ;
    private static volatile Singletone instance;
    private Singletone() {
        counter++;
    }
    /*public static Singletone getInstance() {
        return instance;
    }*/

    /*public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }*/
    /*public synchronized static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }*/
    public static Singletone getInstance() {
        if (instance == null) {
            synchronized (Singletone.class) {
                if (instance == null) {
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }
}