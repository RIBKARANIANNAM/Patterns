package question24;

public class GarbageCollectorExample {
    public static void main(String[] args) {
        GarbageCollectorExample obj = new GarbageCollectorExample();
        obj = null; // Assigning null to the object to make it eligible for garbage collection
        System.gc(); // Suggesting the garbage collector to run
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected.");
    }
}

