package question21;

import java.io.*;

public class SerializationExample implements Serializable {
    private int id;
    private String name;

    public SerializationExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
        SerializationExample obj = new SerializationExample(1, "John");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example.ser"));
        oos.writeObject(obj);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.ser"));
        SerializationExample obj2 = (SerializationExample) ois.readObject();
        ois.close();

        System.out.println("ID: " + obj2.id + ", Name: " + obj2.name);
    }
}
