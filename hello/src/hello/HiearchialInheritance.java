package hello;


class classX {
	
	int x;
	
	void xmethod()
	{
		System.out.println("Iam X method");
	}
	
	}

class classY extends classX
{
int y;

void ymethod()
{
	System.out.println("Iam Y method");
}
	
	}

class classZ extends classX{
	
	int z;
	void zmethod()
	{
		System.out.println("Iam z method");
	}
	
}





public class HiearchialInheritance {

	public static void main(String[] args) {
        classX xobj= new classX();
        classY yobj=new classY();
        classZ zobj=new classZ();
        
        xobj.xmethod();
        yobj.xmethod();
        yobj.ymethod();
        zobj.zmethod();
        

	}

}
