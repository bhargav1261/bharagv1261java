package hello;

public class MethodType2 {
	
	int a;
	int b;
	int c;
	
	//not taking parameters but returning value
	
	int addition()
	{
		int a=20;
		int b=30;
		c=a+b;
		
		return c;
	}
	

	public static void main(String[] args)
	{
		 MethodType2 type2= new  MethodType2();
		 
		 int result=type2.addition();
		 System.out.println(result);
		 

	}

}
