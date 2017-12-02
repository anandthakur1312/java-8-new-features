package java8.streams;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		/**
		 * Stream concept can be applied for any collection of elements. It not restricted just till Collections
		 */
		Stream<Integer> sInt = Stream.of(9,99,999,9999,99999);
		sInt.forEach(System.out::println);
		
		
		Double[] d = {10.0, 10.1, 10.2, 10.3, 10.4, 10.5};
		Stream sArray = Stream.of(d);
		sArray.forEach(System.out::println);

	}

}
