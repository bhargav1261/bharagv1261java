package hello;

  class Parent
  {
	  void show() 
	  {
		  System.out.println("This Parent class");
	  }
  }
class Child extends Parent
{
	void show()
	
	{
		
		System.out.println("This is child metod");
	}

 void showChild() 
 {
	 System.out.println("child class is Unique metod");
 }
}




public class Upcast {

	public static void main(String args[]) {
	Parent obj1=new Child();//Upcast
	Child obj2=(Child)obj1; //Downcast
		obj1.show();
		obj2.showChild();
		
		
	}
}
