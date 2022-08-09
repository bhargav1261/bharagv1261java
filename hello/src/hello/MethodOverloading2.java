
package hello;

public class MethodOverloading2 {
	
//case 2
	
	public void m1(Object o) //Parent method 
	{
		System.out.println("object version");
	}
		
   public void m1(String s) //child method
   {
	   System.out.println("string version");
   }
	public static void main(String[] args) {

		MethodOverloading2 t2= new MethodOverloading2();
		t2.m1(new Object());
		t2.m1("bhargav");    
		t2.m1(null);        // Parent and child method arguments  are matched  then (value is null) it will execute the child method.
		                 //if child method not available then only parent class  method arguments is executed.
		

	}

}
