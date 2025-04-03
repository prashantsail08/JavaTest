package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//What? - Its an interface in [java.util.stream](http://java.util.stream) package since JDK 1.8
//
//where to use ? - Anywhere to deal with the group of objects in your prgm. eg: Array, Collections etc.,
//
//When to use? - if you want to process on the objects from the group of objects (eg: Array, Collections etc.,) then go for Stream API.
//
//What is the advantage of Strem API? → Concise Code
//
//Predicate is a predefine functional interface in which you can give logic
public class StreamIntro {
	public static void main(String[] args) {
		Stream s = Stream.of(10, 20, 30, 40, 100, 200); // groups of objects
		System.out.println(s.count());

		Integer[] i = { 10, 20, 30, 40, 50, 60, 70 };
//		String[] stringArr = { "A", "B", "C", " D", "E" };
		Stream s1 = Stream.of(i);
		System.out.println(s1.count());// deal with array of objects

		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Stream s3 = Stream.of(list);
		System.out.println(s3.count()); // deal with the collection
		System.out.println("--" + list.stream());
		System.out.println("stream is --> " + s3);

		// Proof for the concise code:
		// 1.7 code to create a list with only even number from the given list?
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		List<Integer> result = new ArrayList<>();
		for (Integer r : l1) {
			if (r % 2 == 0) {
				result.add(r);
			}
		}
		System.out.println(result);
		//1.8 code to create a list with only even numbers from the given list?
		List<Integer> l2 = new ArrayList<>();
		l2.add(10);
		l2.add(220);
		l2.add(220);
		l2.add(11);
		l2.add(17);
		l2.add(50);
		List newList = l2.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("newList "+newList);
//		newList.forEach(System.out::print); //Instance method reference: object::instanceMethod
		//System.out::println is a method reference in Java. It's a shorthand way of writing lambda expressions.
		//It refers to the println method of                             System.out, meaning it will print each element of the stream.
		
		//if want do want to get duplicate output what we can do ?
		// and: we will use Set bcoz it avoid duplicate.
		Set newList1 = l2.stream().filter(x->x%2==0).collect(Collectors.toSet());
		System.out.println("newList1 by using set so no duplicate values "+newList);
	}
}
