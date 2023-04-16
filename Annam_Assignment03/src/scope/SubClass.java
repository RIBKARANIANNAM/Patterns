package scope;


	public class SubClass extends overriden {
	    // Overriding a public method with a public method is allowed.
	    public void publicMethod() {
	        System.out.println("This is a public method in the subclass.");
	    }

	    // Overriding a default method with a protected method is allowed.
	    protected void defaultMethod() {
	        System.out.println("This is a protected method in the subclass.");
	    }

	    // Overriding a protected method with a public method is allowed.
	    public void protectedMethod() {
	        System.out.println("This is a public method in the subclass.");
	    }

	    // Attempting to override a private method is not allowed.
	    // This code will result in a compiler error.
	    //public void privateMethod() {
	    //    System.out.println("This is a private method in the subclass.");
	    //}
	}



