package hello;

public class OperationsExample {

	public static void main(String[] args) {
		int x=30;
		int y=20;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(3*2);
		System.out.println(10/5);
		System.out.println(11%5);
		System.out.println(x++); // first print it and then increment it//31
		System.out.println(++x); // first increment and then print it//32
		System.out.println(y--); //first print it and then  decrement it//19
        System.out.println(--y); //first decrement and then print it//18
        
        //logical operators
        
        System.out.println("&& operator is : "+(10>5 && 20>10));
        //System.out.println("&& operator is : "+(10<5 && 20>10));
        System.out.println("|| operator is : "+(10<5 || 20>10));
        System.out.println("|| operator is : "+(10<5 || 20<10));
        System.out.println(" ! operator is : "+(10!=20));
       // System.out.println("== operator is : "+(10==10));
        System.out.println("!= operator is : "+(20!=10));
        System.out.println("< operator is  : "+(20<30));
        System.out.println("<= operator is : "+(20<=30));
        System.out.println("< operator is  : "+(20<30));
        System.out.println("<= operator is : "+(20<=30));
        System.out.println("> operator is  : "+(30>20));
        System.out.println(">= operator is : "+(30>=20));
	
        //string operator
        String name="Vepuri";
        String name1=" Bhargav";
        System.out.println(name+name1);		
        		
      //System.out.println("Vepuri "+"Bhargav");
        
        
	
	}
	
	
}	
	


