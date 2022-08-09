package hello;
// one try block can be followed by multiple catch block
// catch block should bean immediate block after try
public class ExceptionDemo {
 
  public static void main(String[] args) {
	  int b=7;
	  int c=0;
	  try
	  {
		  int k=b/c;
		 // arr[]=new int [5];
		  //System.out.println(arr[7]);
		  System.out.println(k);
		  
		   }
			
			  catch(ArithmeticException et) 
	  {
			  System.out.println("I catched the Arthimetic/Exception"); 
			  }
			  
			  catch(IndexOutOfBoundsException ets) 
	  {
			  System.out.println("I catched IndexBound/Exception"); 
			  }
			  
			  catch(Exception e)// it is parent class and excepts all kinds of exception 
	  {
			  System.out.println("I catched the error/exception"); 
			  }
			 
	  finally
	  {
		  // This block is executed irrespective of exception thrown or not
		  
		  System.out.println("Delete cookies");
	  }
	}

}

