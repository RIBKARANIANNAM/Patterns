package scope;


		public class Main {
		    public static void main(String[] args) {
		        overriden superClass = new overriden();
		        SubClass subClass = new SubClass();

		        // Calling methods on the superclass object.
		        superClass.publicMethod();    // This is a public method in the superclass.
		        superClass.defaultMethod();   // This is a default method in the superclass.
		        superClass.protectedMethod(); // This is a protected method in the superclass.
		        //superClass.privateMethod(); // This is a private method and cannot be accessed.

		        // Calling methods on the subclass object.
		        subClass.publicMethod();    // This is a public method in the subclass.
		        subClass.defaultMethod();   // This is a protected method in the subclass.
		        subClass.protectedMethod(); // This is a public method in the subclass.
		        //subClass.privateMethod(); // This is a private method and cannot be accessed.
		    }
		

	}


