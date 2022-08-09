package hello;

public class Palindrome {

	public static void main(String[] args) {
		String s="bhargav";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+(s.charAt(i));
			
		}
 System.out.println(t);		

 if(s.equals(t))
	 
 {
	 System.out.println("This is palindrome");
 }
 
 else
 {
	 System.out.println("This is not palindrome");
 }
	}

	
}
