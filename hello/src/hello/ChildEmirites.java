package hello;

public class ChildEmirites extends ParentAirTraffic{
// Abstract class
	public static void main(String[] args) 
	{
		ChildEmirites ce=new ChildEmirites();
		ce.Engine();
		ce.safetyGuidelines();
		ce.bodycolor();

	}

	@Override
	public void bodycolor() {
		System.out.println("Red colour");
		
	}

}
