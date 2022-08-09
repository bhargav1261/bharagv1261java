package hello;
  
// To find even and odd in given array

public class ArrayExample6 {

	public static void main(String[] args) {
   
		int ar[]= {6,4,3,5,7,8,2};
      System.out.println("The beleow are the Even numbers in given array");
      
      for( int e:ar) 
      {
    if(e%2==0)
    {
    	System.out.println(e+" ");
    }
    	  
      }
      System.out.println();
      System.out.println("The beleow are the odd numbers in given array");
      for( int e:ar) {
    	if(e%2!=0)
    	{
    		System.out.println(e+" "); 
    	}

}
}
}