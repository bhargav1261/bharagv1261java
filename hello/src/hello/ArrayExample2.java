package hello;
// null pointer Exception
// program for to print null data with emp data
public class ArrayExample2 {

	public static void main(String[] args) {
	    
	       Emp e1 =new Emp(111,"Bhargav");
	       Emp e2=new Emp (112,"Navya");
	       Emp e3=new Emp(112,"Geethan");
	         
		
		
		Emp[] e=new Emp[5];
	       e[0]=e1;
	       e[2]=e2;
	       e[4]=e3;
	   
       
       
       for (Object o:e )  // to store null  data and emp data we can use object class
    	   
    	 {
    	   
    	   if(o instanceof Emp) //instance of the operator is used to type of the object
    	   {
    		 Emp ee = (Emp)o; //Type cast for Emp  format
    		 System.out.println(ee.eid+"---"+ee.ename);
    	   }
    	   
    	   if(o==null)
    	   {
    		   System.out.println(o);
    	   }
       }
       
    		   

	}

}
