package java8;

public class ConstructorRefDoubleColon {

	public static void main(String[] args) {
		
//		Inter2 inter2 = () -> {
//			return new Sample();
//		};
//		inter2.get();
		
//		The above code is similar to the below.	
		
		Inter2 inter2 = Sample::new;
		inter2.get();
		
		

	}

}


class Sample{
	
	public Sample() {
		System.out.println("Sample constructor execution and object creation");
	}
	
}


interface Inter2{
	public Sample get();
}
