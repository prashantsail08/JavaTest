package PreDefineFunctionalInterface;

import java.util.Date;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c =(s) -> System.out.println("The log is -->"+s+" the current date is -->"+ new Date());
		c.accept("hiii");

	}

}
