package hello;

public class MethodOverloading4 {
	
	public void m1(int i)
	
	{
		System.out.println("Genaral method");
		
	}

	public void m1(int... i) /*
								 * it is introduced in java 1.5 example- int();,int(10),int(10). it has least
								 * priority no other method matched with other methods then var arg method will
								 * be executed
								 */
{
	System.out.println("Var arg methods");
}


	public static void main(String[] args) {
		
		MethodOverloading4 m4 =new MethodOverloading4();
		m4.m1();
		m4.m1(10,20);
        m4.m1(10);   //   old version execute first
     

	}

}
