package hello;

import demopack.CentralTraffic;
import demopack.ContinentTraffic;

public class AustralianTrafic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		CentralTraffic a=new AustralianTrafic();
		a.Green();
		a.Red();
		a.Falshingyellow();
		 AustralianTrafic at=new  AustralianTrafic();
		 ContinentTraffic ct=new  AustralianTrafic();
		 at.Walkonsymbol();
		 ct.Trainsymbol();
		
	}
	

	@Override
	public void Green() {
		System.out.println("Gereengo implementation");
		
	}

	@Override
	public void Red() {
		System.out.println("Redstop implementation");
		
	}

	@Override
	public void Falshingyellow() {
		System.out.println("Flashingyellowready implementation");
		
		
	}
	
	public void Walkonsymbol()
	{
		System.out.println("Walking implementation");
		
	}


	@Override
	public void Trainsymbol() {
		{
		
			System.out.println("Trainsymblol implementation");
		}
		
	}

}
