package hello;



interface ABC{
	
	int x=100;
	
	void m1();             //abstract method
	
}

interface XYZ
{
	int y=300;
	void m2();              //abstract method
}

public class MultpleInheritance implements ABC,XYZ {
	
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()             
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		MultpleInheritance multiple=new MultpleInheritance ();
		ABC obj1=new MultpleInheritance ();
		XYZ obj2=new MultpleInheritance ();
		multiple.m1();
		multiple.m2();
		obj1.m1();
		obj2.m2();
		
	}

}



