package hello;

public class SwitchExample {

	public static void main(String[] args) {
		
		String month="Jan";
		
		switch (month) {
		case "Jan":
		{
		System.out.println("No days Jan-31 days" );
		}
			break;
		case "Feb":
		{
			System.out.println("No days Feb -28 Days");
			
		}
          break;
		case "Mar":
		{ 
			System.out.println("No days Mar -31 days");
		}
		  break;
		case "Apr":
		{
			System.out.println("No days Apr -30 days");
		}
		  break;
		case "May":
		{
			System.out.println("No Days May -31 days");
		}
		  break;
		  
		case "June":
		{
			System.out.println("No days June - 30 days");
		}
		 
		 break;
		 
		default:
		{
			System.out.println("Please enter valid Month");
			break;
		}
		}
		
		
	}

}
