package hello;

public class MethodOverloading5 {
	
	public void m1(int i, float f)
	{
		System.out.println("int-float version");
	}
	
	public void m1(float f,int i) {
		System.out.println("float-int version");
	}

	public static void main(String[] args) {

		MethodOverloading5 m5=new MethodOverloading5();
		m5.m1(10,20.30f);
		m5.m1(10.35f, 20);
		//m5.m1(10, 10); // it gives error because both method are matched(ambiguous type)
         // m5.m1(10.5f, 10.3f); //Unresolved compilation problem: 
      	                      //The method m1(float, int) in the type MethodOverloading5 is not applicable for the arguments (float, float)
	}

}
