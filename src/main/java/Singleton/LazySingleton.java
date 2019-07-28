package Singleton;

public class LazySingleton {
    private static LazySingleton singleton = null;
    private int num = 0;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }

    public synchronized int getNum() {
        return ++num;
    }
}
