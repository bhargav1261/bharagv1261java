package hello;


interface intA{
	int x=50;
	int y=70;
	
	void addition();  //Abstract Method
	
}

class  ABCD implements intA{
	
	public void addition()
	{
		System.out.println(x+y);
		
	}
	
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
	//ABCD abcdobj=new ABCD();
	     intA abcdobj= new ABCD();
		abcdobj.addition();

	}

}