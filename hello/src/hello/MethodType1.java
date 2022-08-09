package hello;

public class MethodType1 {
	
	int StudentId;
	String StudentName;
	int Marks;
	String Address;
	
	//Case1- not taking parameters and also not returned any value
	
	void show()
	
	{
		System.out.println(StudentId);
		System.out.println(StudentName);
		System.out.println(Marks);
		System.out.println(Address);
	}
	
	

	public static void main(String[] args) 
	{
		MethodType1 type1 =new MethodType1();
		type1.StudentId=1234;
		type1.StudentName="Bhargav";
		type1.Marks=99;
		type1.Address="Vijayawada";
		type1.show();
	}

}
