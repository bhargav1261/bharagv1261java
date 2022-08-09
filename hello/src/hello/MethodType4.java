package hello;

public class MethodType4 {
	 
	int a;
	int b;
	int c;
	
	//4)case4 -Method is taking parameters and returning value.
	
	int addition(int a,int b)
	{
		c=a+b;
		return c;
	}
	

	public static void main(String[] args) 
	{

		 MethodType4 type4 =new  MethodType4();
		  
		 int add=type4.addition(200, 150);
		 System.out.println(add);
				 

	}

}
