package question27;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation from outside the class
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello, I am a singleton!");
    }
}

