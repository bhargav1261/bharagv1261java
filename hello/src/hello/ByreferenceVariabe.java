package hello;

public class ByreferenceVariabe {
	
	int empId;
	String eName;
	double sal;
	String Designation;
	
	void show()
	{
	System.out.println(empId);	
	System.out.println(eName);
	System.out.println(sal);
	System.out.println(Designation);
	}
	
	public static void main(String[] args) 
	
	{
		ByreferenceVariabe ref1=new ByreferenceVariabe();
		ref1.empId=100;
		ref1.eName="Bhargav";
		ref1.sal=200.34;
		ref1.Designation="Qa developer";
		ref1.show();
				
				
	}
	
}
	