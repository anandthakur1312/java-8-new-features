package java8;

public interface Inter {
	
	public void m1();
	
	public static void s1(){
		System.out.println("I am static");
	}
	
	public static void main(String[] args) {
		System.out.println("I am main");
	}
	
	default void d1(){
		System.out.println("I am default");
	}

}
