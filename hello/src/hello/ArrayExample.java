package hello;

public class ArrayExample {

	public static void main(String[] args) {
		int[] a= {10,20,30,40}; 
		/*
		 * System.out.println(a[0]);       //case1
		 *  System.out.println(a[1]); 
		 * System.out.println(a[2]);
		 * System.out.println(a[3]);
		 */
		/*
		 * for (int i = 0; i < a.length; i++) // case2
		 * 
		 * { System.out.println(a[i]); }
		 */
		
		  for(int aa:a) //case 
		  { 
		  System.out.println(aa);
		   }
		 

	}

}
