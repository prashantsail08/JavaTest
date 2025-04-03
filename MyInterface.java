package LambdaAndFunctionalInterface;
//Functional Interface
public interface MyInterface {

	public void mt1(); // Declare but dont define

}

//This is the implementation class of Functional Interface.
//This implementation is going to be replaced by the Lambda Expression.

class MyImpl implements MyInterface {
	@Override
	public void mt1() {
		System.out.println("this is my mt1...");
	}

}
