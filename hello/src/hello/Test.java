package hello;



class Z
{
	 
	  public void m1()
	 
	 {
		 System.out.println("Parent");
	 }
	 
}


class G extends Z
{
	 
	public void m2()
	{
		System.out.println("Child");
	}
	 
	 
	}




public class Test {

	public static void main(String[] args) {
		/*
		 * //case1- we can call parent method not child method 
		 * P p =new P(); 
		 * p.m1();
		 * p.m2();//error
		 */ 
		
		 //case2-we can call both parent and child Methods 
		 G g=new G(); 
		  g.m1();
		  g.m2();
		 
		//case1- we can call parent method not child method 
		/*
		 * P p =new C(); 
		 * p.m1(); 
		 * p.m2();//error
		 */		        
			}

}


