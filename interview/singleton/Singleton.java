package interview.singleton;

public class Singleton {
    //懒汉式
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton(){
        if (singleton != null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
