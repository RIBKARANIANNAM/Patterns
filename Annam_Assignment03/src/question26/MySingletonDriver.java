package question26;

public class MySingletonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton instance1 = MySingleton.getInstance();
		MySingleton instance2 = MySingleton.getInstance();
		System.out.println(instance1 == instance2); // prints "true"


	}

}
