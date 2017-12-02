package java8;

import java.util.function.Predicate;

public class Lambda1 implements Inter {
	
	public int x = 888;
	
	public void maza(){
		int y = 999;
		Inter i = () ->{
			
			System.out.println(x);
			//System.out.println(y);
			
		};
		i.m1();
		y++;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Lambda1 lambda1 = new Lambda1();
		lambda1.maza();
		lambda1.d1();
		Inter.s1();
		
		

		
		
	
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void d1() {
		System.out.println("over ridden");
		
	}
	
	

}
