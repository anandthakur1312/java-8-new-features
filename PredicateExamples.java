package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * 
 * @author Anand
 *
 */
public class PredicateExamples {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Predicate<Collection> pCollection = c -> c.isEmpty();
		
		ArrayList<String> stringListFilled = new ArrayList<>();
		stringListFilled.add("Anand");
		stringListFilled.add("Mannu");
		
		System.out.println(pCollection.test(stringListFilled));
		
		
		ArrayList<String> stringListEmpty = new ArrayList<>();
		System.out.println("negate test");
		System.out.println(pCollection.test(stringListEmpty));
		System.out.println(pCollection.negate().test(stringListEmpty));

		
		
		
		
Predicate<String> p1 = s -> s.length() > 9;
		
		System.out.println(p1.test("anand"));
		System.out.println(p1.test("anandSinghThakur"));		
		
		Predicate<Integer> p = i -> i > 10;
		
		System.out.println(p.test(1));
		System.out.println(p.test(100));
		
//		Predicate<Integer> p = (i) ->  {
//			
//			if ( i > 10){
//				System.out.println("Predicate true");
//			return true;
//			}
//			else{
//				System.out.println("Predicate false");
//			return false; 
//			}
//			
//		};
//		p.test(9);
		
	}

}
