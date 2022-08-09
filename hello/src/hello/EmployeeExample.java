package hello;

public class EmployeeExample {
	
	int eId;
	String eName;
	double sal;
	String Designation;
	
	void display()
	{
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(Designation);
	}
	
	void bonus()
	{
		System.out.println((sal*10)/100);
	}
	

public static void main(String[] args) 

{
		
	EmployeeExample emp1=new EmployeeExample();
	      emp1.eId=100;
	      emp1.eName="Bhargav";
	      emp1.sal=4000;
	      emp1.Designation="Test Engineer";
	      
	      
	        emp1 .display();
            emp1.bonus();
            
            EmployeeExample emp2=new EmployeeExample();
  	      emp2.eId=200;
  	      emp2.eName="John";
  	      emp2.sal=3000;
  	      emp2.Designation="Qa Engineer";
  	      
  	      
  	        emp2 .display();
              emp2.bonus();
              
            
            

	}

}
