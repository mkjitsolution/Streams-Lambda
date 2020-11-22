package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// remove all js technologies 
public class Streams {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("java-se");
		list.add("java-ee");
		list.add("node.js");
		list.add("react.js");
		list.add("python.py");
		list.add("dotNet");

		for (String data : list) {
			data = data.toUpperCase();
			System.out.println(data);
		}

		Stream<String> stream = list.stream();

		// print the list through streams
		/*
		 * stream.forEach(new Consumer<String>() {
		 * 
		 * @Override public void accept(String t) { // TODO Auto-generated method stub
		 * System.out.println(t); }
		 * 
		 * });
		 * 
		 */
		System.out.println(" --- output using lambda ---");
		// Non-terminal operation
		Stream<String> upperCaseList = stream.map((String element) -> {
			return element.toUpperCase();
		});
		// Ternimal operation
		upperCaseList.forEach((String element) -> {
			System.out.println(element);
		});

		// ----------------------- -----------------

		System.out.println("\n\n");

		System.out.println(" **** Using Stream API ****");

		list.stream().
			map((String element) -> element.substring(1, 4)).
			map((String element) -> element.toUpperCase()).
			forEach((String element) -> System.out.println(element));

		System.out.println(" **** Using Stream API ****");

		list.stream().
			map((element) -> element.substring(1, 4)).
			map(String::toUpperCase).
			forEach(System.out::println);

	}// end main

}
