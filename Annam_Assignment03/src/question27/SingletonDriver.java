package question27;

public class SingletonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		instance1.sayHello(); // output: "Hello, I am a singleton!"
		instance2.sayHello(); // output: "Hello, I am a singleton!"

		System.out.println(instance1 == instance2); // output: "true"


	}

}
