package PreDefineFunctionalInterface;

import java.util.function.Predicate;

public class PredicateDrmo {
	public static void main(String[] args) {
		Predicate<Integer> p =(i)-> i%2 ==0;
		System.out.println(p.test(10));
		
		Predicate<String> p1 = (s) -> s.length()>3;
		System.out.println(p1.test("Hii"));
	}
}
