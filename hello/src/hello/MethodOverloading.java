package hello;

public class MethodOverloading {
	
	//compile time Overloading or static overloading or early binding
	
	public void m1()
	{
		System.out.println("no arguments");
		
	}
	
	public void m1(int i)
	{
	System.out.println("int arguments");	
	}
	
	public void m1(double d)
	{
		System.out.println("double arguments ");
	}

	public static void main(String[] args) {
		
		 MethodOverloading m =new  MethodOverloading();
		 m.m1();
		 m.m1(10);
		 m.m1(30.5);
		 
	}

}
