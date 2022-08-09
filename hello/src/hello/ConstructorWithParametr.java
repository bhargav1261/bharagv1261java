package hello;

public class ConstructorWithParametr {
	
	int empId;
	String empName;
	double salary;
	String designation;
	
	ConstructorWithParametr(int eId,String eName,double sal,String des)
	{
	empId=eId;
	empName=eName;
	salary=sal;
	designation=des;
	}
	void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(designation);
	}
	

	public static void main(String[] args) {
		
		ConstructorWithParametr ref1 = new ConstructorWithParametr(1234,"john",2000.89,"Test Engineer");
		ref1.display();
	}

}
