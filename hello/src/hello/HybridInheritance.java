package hello;

class A1{
	
	public void m1()
	{
		System.out.println("This m1 method for A1 class");
	}
	
}

interface B1{
	
	void m2();
	
}

interface B2{
	
	void m3();
}


public class HybridInheritance extends A1 implements B1,B2 {

	public void m2()
	{
		System.out.println("This is m2 method for B1 inteface");
	}
	
	public void m3() 
	{
		System.out.println("This is m3 method for B2 interface");
	}
	
	
	public static void main(String[] args) {
		
		HybridInheritance hybrid= new HybridInheritance();
		hybrid.m1();
		hybrid.m2();
		hybrid.m3();
		
		
		}
	
	
}






