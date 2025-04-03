package PreDefineFunctionalInterface;

import java.util.function.Supplier;

public class SuplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> s =()->Math.random();
		System.out.println(s.get());

	}

}
