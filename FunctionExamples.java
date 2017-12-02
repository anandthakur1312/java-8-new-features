package java8;

import java.util.function.Function;

public class FunctionExamples {

	public static void main(String[] args) {

		Function< String, Integer> fStringLength = s -> s.length();
		System.out.println(fStringLength.apply("klwfhwk;lkklgkwcklwcv"));
		System.out.println(fStringLength.apply("cklwcv"));
		
		Function< Integer, Integer> fNumSqure = n -> n*n;
		System.out.println(fNumSqure.apply(8));
		System.out.println(fNumSqure.apply(11111));
	}

}
