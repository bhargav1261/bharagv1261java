package hello;
  
// program for find and print  the indexes of null values

public class ArrayExample3 {

	public static void main(String[] args) {

           Emp f1= new Emp(111,"Rakesh");
           Emp f2=new Emp(112,"Mahesh");
           Emp f3=new Emp(113,"Ravi");
           
           Emp[] k=new Emp[5];
            k[0]=f1;
            k[2]=f2;
            k[4]=f3;
            
            for ( int i=0;i<k.length;i++)
            {
            	
           if (k[i] == null)
           {
        	   System.out.println(i);
           }
            			
            	
            }
           
           
           

	}

}
