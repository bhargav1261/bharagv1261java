package hello;


class classM{
	
	int m;
	
	void mmethod()
	{
		System.out.println("Iam M class method");
	}
	
}



class classN extends classM{
	
	int n;
	
	void nmethod()
	{
		System.out.println("Iam N class method");
	}
	
	
	
}


class classO extends classN {
	
	int o;
	
	void omethod()
	{
		System.out.println("Iam O method");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {

     classM mobj = new classM();
     classN nobj = new classN();
     classO oobj = new classO();
      
     mobj.mmethod();
     nobj.mmethod();
     nobj.nmethod();
     oobj.omethod();

	}

}
