package hello;

public class ElseIfExample {

	public static void main(String[] args) {

    String month="May";
    
    if(month.equals("Jan"))
    {
    	System.out.println("No days in jan -31 days");
    }
    else if(month.equals("Feb"))
    
     {
    System.out.println("No days in Feb is -28 days");	
    }
    else if(month.equals("Mar"))
    {
    	System.out.println("No days March -31 days");
    	
    }
    else if(month.equals("Apr"))
    {
    	System.out.println("No days Apr -30 days");
    }
    
    else if(month.equals("May"))
    {
    	System.out.println("No days May -31 days");
    	
    }
    else if(month.equals("June"))
    {
    	System.out.println("No days june -30 days");
    }
    else
    {
    	System.out.println("Please provide valid month");
    }
	}

}
