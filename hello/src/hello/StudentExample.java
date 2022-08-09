package hello;

public class StudentExample {
	
	int sId;
	String sName;
	int subj1;
	int subj2;
	int subj3;
	
	void getStuData()
	{
		System.out.println(sId);
		System.out.println(sName);
		
	}
	
	 void getStuMarks()
	 {
		 System.out.println(subj1);
		 System.out.println(subj2);
		 System.out.println(subj3);
		 
	 }
	
	 void total() 
	 {
		 System.out.println("Total: "+(subj1+subj2+subj3));
	 }
	 
	

	public static void main(String[] args) 
	{
		
		StudentExample stud1=new StudentExample();
		stud1.sId=200;
		stud1.sName="Bhargav";
		stud1.subj1=70;
		stud1.subj2=80;
		stud1.subj3=60;
		 
		stud1.getStuData();
		stud1.getStuMarks();
		stud1.total();
				
	}

}
