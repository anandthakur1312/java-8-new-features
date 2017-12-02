package java8;

public class MethodReferenceDoubleColon {
	
	public static void m2(){
		System.out.println("Implementation for m1 - using static m2 - Present in Inter interface");
	}
	
	public void m3(){
		System.out.println("Implementation for m1 using instance m3 - Present in Inter interface");
	}

	public void runImplementation(){
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		Inter inter = () -> System.out.println("Implemention using lambada");
		inter.m1();
		
		Inter inter2 = MethodReferenceDoubleColon::m2;
		inter2.m1();
		
		MethodReferenceDoubleColon doubleColon = new MethodReferenceDoubleColon();
		Inter inter3 = doubleColon::m3;
		inter3.m1();
		
		Runnable r = doubleColon::runImplementation;
		r.run();
		
	}
	
	

}
