package interview.singleton;

public class Singleton1 {
    //饿汉式
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
