package hello;

public class Caluclation {
	
	 public int add(int x,int y) 
	{
		int sum=x+y;
		
		return sum;
	}
	
	 public int add(int x,int y,int z) 
		{
			int sum1=x+y+z;
			
			return sum1;
		}
		
	

	public static void main(String[] args) {
		
		Caluclation cal=new Caluclation();
		int sum=cal.add(10, 20);
		int sum1=cal.add(3, 5, 6);
		System.out.println(sum);
		System.out.println(sum1);
		
   
	}


	

}
