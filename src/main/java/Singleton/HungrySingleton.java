package Singleton;

public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private int num=0;
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
    public synchronized  int getNum(){
       return ++num;
    }

}
