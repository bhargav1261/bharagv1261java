package hello;


 class Animal
{

	 public void m1(Animal a)
	 {
		 System.out.println("Aninal Version");
	 }

}

class Monkey extends Animal{
	
	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}
	
}


public class MethodOverloading6 {

	public static void main(String[] args) {
		 Animal a=new Animal();
		 a.m1(a);
		Monkey m =new Monkey();
		m.m1(m);
		Animal a1=new Monkey();
        a1.m1(a1);  //  In overloading method resolution always executed by compiler based reference type run type object never plays any roll.
		 


	}

}
