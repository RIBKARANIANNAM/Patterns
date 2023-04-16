package question26;

import java.io.Serializable;

public class MySingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static MySingleton instance = new MySingleton();

    private MySingleton() {
        // private constructor to prevent instantiation from outside the class
    }

    public static MySingleton getInstance() {
        return instance;
    }

    // readResolve method to preserve singleton property during deserialization
    protected Object readResolve() {
        return instance;
    }
}

