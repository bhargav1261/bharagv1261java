package hello;
import java.util.Scanner;
// Java program for to find max and min element of given array

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n=sc.nextInt();  //converting the string data type value to int data type
	
	    int a[]=new int[n];
	    int i;
	    System.out.println("Enter the array elements");
	    for(i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	
	System.out.println("The entered array elements are");
	
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	 
	int max=a[0];
	int min=a[0];
	for(i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
			}
		if(a[i]<=min)
		{
			min=a[i];
		}
		
	}
  System.out.println("Maximum element in the given array is :"+max);
  System.out.println("Minimum element in the given array is :"+min);
	}
	
	}

