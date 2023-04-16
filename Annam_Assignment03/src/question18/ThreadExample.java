package question18;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.start(); // This will throw an IllegalThreadStateException
    }
}
