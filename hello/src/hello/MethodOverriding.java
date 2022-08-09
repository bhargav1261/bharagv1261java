package hello;


// Runtime Polymorphism
// Dynamic Polymorphism
// Late Binding

class P {
	
	public void Property()
	{
		System.out.println("cash+gold+Land");
	}

	public void marry()          //Overridden Method
	{
		System.out.println("subbalaxmi/appulamma"); 
	}



}


class C extends P{           
	
	public void marry()           //Overriding Method
	{
		System.out.println("Katrina");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
     P p=new P();
     p.Property();
     p.marry();
     C c=new C();
     c.marry();
     P p1=new C(); // In Overriding method resolution is take care by Jvm based on runtime object then child method object will be executed
     p1.marry();
     
    
	}

}
