/**
Christopher Cornwall
Home Work
November 11 2011
*/

	public class InternetBillSaving {

		private double hours;
		private String pack;
		private double monthlyBill;
		private double compareBill;
		private double savingB;
		private double savingC;

	public InternetBillSaving(double H, String P)
	{	
		hours = H;
		pack = P;
		CalculateBill();
		setSavingB();
		setSavingC();
		
	}

	private void setSavingB()
	{
		switch(pack){
		
	case "A":
	{
		if(hours > 10)
			{monthlyBill = (9.95 + ((hours - 10) * 2.0));

			compareBill = 14.95;}
		
		else 
		
			{monthlyBill = 9.95;

			compareBill = 14.95;}
		

		if(monthlyBill > compareBill)
		{
			savingB = monthlyBill - compareBill;
		}
	}
			break;

		default:
		{
			}
			break;
			}
	}



	private void setSavingC()
	{
		switch(pack){
		
	case "B":
	{	
		if(hours > 20)
			{monthlyBill = (14.95 + ((hours - 20) * 1.0));

			compareBill = 19.95;}
		
		else 
			{monthlyBill = 14.95;

			compareBill = 19.95;}
		

		if(monthlyBill > compareBill)
		{
			savingC = monthlyBill - compareBill;
		}
	}
			break;


	
	case "A":
	{
		if(hours > 10)
			{monthlyBill = (9.95 + ((hours - 10) * 2.0));

			compareBill = 19.95;}
		
		else 
			{monthlyBill = 9.95;

			compareBill = 19.95;}
	
	

		if(monthlyBill > compareBill)
		{
			savingC = monthlyBill - compareBill;
		}
	}
			break;

		default:
		{
			}
			break;

			}
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
	
	public double getCompareBill()
	{
		return compareBill;
	}

	public double getSavingB()
	{
		return savingB;
	}

	public double getSavingC()
	{
		return savingC;
	}
}
