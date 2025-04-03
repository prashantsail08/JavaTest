package LambdaAndFunctionalInterface;


/*
 * Lambda:
 * 
 * what is Lambda? - its anonymous function - NO NAME, NO RETURN TYPE, NO SPECIFIER
 * Why to Lambda? - To simply  the code which increases the code readability, maintainability
 * 
 * How to write Lambda expression? - by using "->"
 * 
 * How to link a functional interface with lambda?
 * -- a functional interface can be used to hold the lambda expression
 * 
 * How lambda and functional interface works together? - the below program.
 * 
 * 
 * 
 * Wherer? --> whenever i want to use lambda function, 
 * i can create or use a functional interface to call the lambda function.
 * Real time example :- Multithreading , Collections
 * 
 *  Multhreading --> extending a thread (c)
 *  --> implements --> Runnable (I) --> run();
 *  --> Implemnts --> Callable(I) __> call();
*/
public class LambdaDemo {
	public static void main(String[] args) {
//		MyInterface i = new MyImpl(); OR
		
		MyInterface i = new MyImpl();
		i.mt1();
		
		MyInterface j =()->System.out.println("this is my mt1 by lambda function..");
		j.mt1();
	}

}
