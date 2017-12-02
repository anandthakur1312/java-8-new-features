package java8;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30,35,40,45,50};
		
		Predicate<Integer> pEven = i -> i%2 == 0;
		Predicate<Integer> pMultipleOf5 = i -> i%5 == 0;
		
		System.out.println("even numbers");
		check(pEven, x);
		
		System.out.println("odd numbers");
		check(pEven.negate(), x);
		
		System.out.println("numbers multiple of 5");
		check(pMultipleOf5, x);
		
		System.out.println("numbers multiple of 5 and even");
		check(pMultipleOf5.and(pEven), x);
		
		System.out.println("numbers multiple of 5 or even");
		check(pMultipleOf5.or(pEven), x);	
		

	}
	
	private static void check(Predicate<Integer> p , int [] x){
		for (int x1 : x) {
			if(p.test(x1)){
				System.out.println(x1);
			}
				
			
		}
	}

}
