package hello;

public class MethodType3 {
	
	int studId;
	String studName;
	//Case3-  taking parameters and also not returned any value
	
	void setdata(int id,String name)
	{
		studId=id;
		studName=name;
	}

	
	void show()
	{
		System.out.println(studId);
		System.out.println(studName);
	}
	
	public static void main(String[] args) {

		MethodType3 type3= new MethodType3();
        type3.setdata(100, "Bhargav");
		type3.show();
	}

}
