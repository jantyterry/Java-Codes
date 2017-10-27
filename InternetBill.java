/**
Christopher Cornwall
Home Work
November 11 2011
*/

	public class InternetBill {

		private double hours;
		private String pack;
		private double monthlyBill;

	public InternetBill(double H, String P)
	{	
		hours = H;
		pack = P;
		CalculateBill();
	}

	private void CalculateBill(){

		switch(pack){

	case "A":
	{
		if(hours > 10)
			{monthlyBill = (9.95 + ((hours - 10) * 2.0));}
		
		else 
			{monthlyBill = 9.95;}
		
	}
		break;

	case "B":
	{
		if(hours > 20)
			{monthlyBill = (14.95 + ((hours - 20) * 1.0));}
			
		else 
			{monthlyBill = 14.95;}
	}
		break;

	case "C":
	{
		monthlyBill = 19.95;
		
	}
		break;
	
	default:
	{
		System.out.println("Invalid pack");
	}
		break;
	
	}
	
	}

	public double getHours()
	{
		return hours;
	}

	public double getMonthlyBill()
	{
		return monthlyBill;
	}
	
	public String getPack()
	{
		return pack;
	}
}


