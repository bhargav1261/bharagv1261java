package hello;

public class Swapping {

	public static void main(String[] args) {
		int a=10,b=0;int t;
		System.out.println("Before Swapping :"+a+" "+b);
		
		/*
		 * a=a+b; //30 b=a-b; //10 a=a-b; //20
		 */		
		
		t=a;
		a=b;
		b=t;
		System.out.println("after SWapping :"+a+" "+b);
		
		
		

	}

}
