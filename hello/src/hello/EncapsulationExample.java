package hello;

class Student1
{
	
	private String name1;
	
	public void setName(String name)
	{
	
	this.name1=name;
	
	}
	
	public String getName()
	{
		return name1;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Student1 student=new Student1();
		student.setName("Bhargav");
		System.out.println(student.getName());

	}

}



