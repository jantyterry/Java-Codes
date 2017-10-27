/**
Christopher Cornwall
Home Work
November 11 2011
*/

	 	public class Speed{

			private double distance;
			private double time;
	
	public Speed( double d)
		{
			distance = d;
		}

	public double getSpeedInAir()
		{
			time = distance / 1100;
			return time;
		}

	public double getSpeedInWater()
		{
			time = distance / 4900;
			return time;
		}
	
	public double getSpeedInSteel()
		{
			time = distance / 16400;
			return time;
		}

	
	public double getDistance()
		{
			return distance;
		}
	}
	
