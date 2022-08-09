package hello;

public class MethodOverloading3 {
	
	
 public	 void m1(String s)
	{
		System.out.println("String version");
		
	}
 public void m1(StringBuffer sb)
 {
	 System.out.println("StringBuffer version");
 }

	
	
	public static void main(String[] args) {

		MethodOverloading3 m3=new MethodOverloading3();
		m3.m1("Durga");
		m3.m1(new StringBuffer("Durga"));
		//m3.m1(null);  // If methods don't have any relation and both methods are same types(String) 
		                   // then (value is null) it will throws Compile error
				

	}

}
