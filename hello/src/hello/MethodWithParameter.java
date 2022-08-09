package hello;

public class MethodWithParameter 
{
	
	int empId;
	String eName;
	double sal;
	String Designation;
	
	void setdata(int eId,String empName,double salary,String Des)
	{
		
		empId=eId;
		eName=empName;
		sal=salary;
		Designation=Des;
		
	}
	
	
	  void display() 
	  { 
	  System.out.println(empId); 
	  System.out.println(eName);
	  System.out.println(sal); 
	  System.out.println(Designation);
	  
	  }
	 
	
	
	public static void main(String[] args) 
	{
		MethodWithParameter ref1=new MethodWithParameter();
		
		ref1.setdata(100, "bhargav", 230.03,"Qa Engineer");
		ref1.display();
	}
	
	
	}
