package hello;

public class Methodoverloading1 {

	// case :1 Automatic promotion in overloading
	
	public void m1(int i)
	{

    System.out.println("int arguments");
	}
	
	public void m1(float f)
	{
		System.out.println("float arguments");
	}
	
	public static void main(String[] args) {

		Methodoverloading1 t =new Methodoverloading1();
		t.m1(10);
		t.m1(30.5f);
		t.m1('a');   //  it passes  the next level promotion(char to int)
		t.m1(10L);   //  it passes  the next level promotion(long to float)
		//t.m1(10.50); // it gives compile time error because next level promotion is not available(double)
		

	}

}
