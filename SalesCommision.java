/**
christopher Cornwall
v0.1
*/

public class SalesCommision {


              private double sales;
	      private double rate;
              private double commision;
              private double advance;
              private double pay;

   public SalesCommision(double s, double a)
	{
               sales = s;
               advance = a;
               calculatePay();
	}

   private void setRate()
	{
          if (sales<1000)
             rate = 0.05;
            else if (sales<1500)
             rate = 0.1;
            else if (sales<1800)
             rate = 0.12;
            else if (sales < 2200)
             rate = 0.14;
            else
             rate = 0.16;

	}
   private void calculatePay()
	{
           setRate();
           commision = rate * sales;
           pay = commision - advance;

	}
   public double getPay()
	{
           return pay;
	}
   public double getCommision()
	{
           return commision;
	}
   public double getRate()
	{
           return rate;
	}
   public double getAdvance()
	{
             return advance;
	}
   public double getSales()
	{
             return sales;
	}
}