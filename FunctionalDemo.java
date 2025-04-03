package PreDefineFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

/*
what is Function - it's a pre-defined functional interface provided by Oracle team since JDE 1.8

when to use Function? - when you want to perform some operation on the given input and expects its output.

how to use? - using apply() method which return the same object type as i/p.

1. wrtie a prgm to add 150 to the given number during the run time
2. write a prgm to frame the firstName  - firstName.

*/
public class FunctionalDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f =(i)-> 150+i;
		System.out.println(f.apply(200));
		
		Function<String, String> f2 = (s) -> s+" - " +s;
		System.out.println(f2.apply("Prashant"));

	}

}
