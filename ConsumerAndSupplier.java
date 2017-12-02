package java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {

	public static void main(String[] args) {
		
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Anand Consumer");
		consumer.accept("Mannu Sweet Girl");
		
		
		Supplier<String> supplier = () -> {
			String[] names = {"Sunny", "Bunny", "Funny", "Jinnie", "Tini"};
			
			int x = (int) (Math.random() * 4 + 1);
			return names[x];
		};
		
	System.out.println(supplier.get());
	System.out.println(supplier.get());
	System.out.println(supplier.get());
	System.out.println(supplier.get());
		
	}
}
