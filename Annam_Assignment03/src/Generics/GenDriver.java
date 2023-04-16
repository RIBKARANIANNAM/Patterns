package Generics;

public class GenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen<String> stringList = new gen<String>(10);
		stringList.add("Hello");
		stringList.add("World");
		System.out.println(stringList.get(0));
		System.out.println(stringList.get(1)); 


	}

}
