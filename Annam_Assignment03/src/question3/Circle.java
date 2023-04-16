package question3;

public class Circle extends Covariant {
	
	    @Override
	    public Circle draw() {
	        System.out.println("Drawing a Circle");
	        return new Circle();
	    }
	}


