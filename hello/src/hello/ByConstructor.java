package hello;

public class ByConstructor {
	
	int eId;
	String eName;
    double sal;
    String designation;
    
    ByConstructor()
    {
    	eId=100;
    	eName="Bhargav";
    	sal=290.98;
    	designation="Bo developer";
    	
    }
    
	void dispay()
	{
	System.out.println(eId);
	System.out.println(eName);
	System.out.println(sal);
	System.out.println(designation);
	}
	
	

	public static void main(String[] args) 
	{

		 ByConstructor ref1=new  ByConstructor();
		 ref1.dispay();

	}

}
