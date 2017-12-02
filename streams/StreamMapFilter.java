package java8.streams;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapFilter {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Anand");
		names.add("Ramanandsagar");
		names.add("Ramgopal");
		names.add("pew");
		names.add("gopala");
		
		System.out.println(names);
		
		List<String> namesGrtrThan5 = names.stream().filter(name -> name.length()>5).collect(Collectors.toList());
		System.out.println("Names greater the 5 digits " +namesGrtrThan5);
		
		
		List<String> namesInCaps = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Names if uppercase : " +namesInCaps);
		
		long countOfNames = names.stream().filter(name -> name.length()>5).count();
		System.out.println("Count of the names greater than 5 digits :" + countOfNames);
		
		
		ArrayList<Integer> rollNums = new ArrayList<>();
		rollNums.add(1);
		rollNums.add(5);
		rollNums.add(4);
		rollNums.add(3);
		rollNums.add(2);
		
		List<Integer> sortedRollNums = rollNums.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Roll No in Ascending Order : " + sortedRollNums);
		
		Comparator<Integer> comparator = (i1,i2) ->i2.compareTo(i1);
//		Comparator<Integer> comparatorOld = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer i1, Integer i2) {
//				// TODO Auto-generated method stub
//				return i2.compareTo(i1);
//			}
//		};
//		
		//List<Integer> sortedRollNumsDesc = rollNums.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> sortedRollNumsDesc = rollNums.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println("Names in desc order : " + sortedRollNumsDesc);
		
		int minRollNum = rollNums.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The min roll num is : " + minRollNum);
		
		int maxRollNum = rollNums.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The max roll num is : " + maxRollNum);
	
		
		/**
		 * forEach() to iterate over all the objects of a collection. it does not return anything.
		 */
		System.out.print("Printing each roll num : " );
		rollNums.stream().forEach(i -> System.out.print(i + ", "));
		
		System.out.println("");
		/**
		 * passing method reference using :: in forEach() instead of lambda expression
		 */
		System.out.print("Printing each roll num : " );
		rollNums.stream().forEach(System.out::print);
		
		
		/**
		 * toArray(). To add elements of arrayList to Array.
		 */
		
		System.out.println("");
		Integer[] rollNumArray = rollNums.stream().toArray(Integer[] :: new);
		System.out.print("Prining elements of array : ");
		for(Integer i : rollNumArray){
			System.out.print(i + ",");
		}
		
		
		
		
		
	}

}
