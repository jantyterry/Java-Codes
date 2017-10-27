/**
Christopher Cornwall
Home Work
November 11 2011
*/

	 	public class Speed{

			private double distance;
			private double Time;
	
	public Speed( double d)
		{
			distance = d;
		}

	public double getSpeedInAir()
		{
			Time = distance / 1100;
			return Time;
		}

	public double getSpeedInWater()
		{
			Time = distance / 4900;
			return Time;
		}
	
	public double getSpeedInSteel()
		{
			Time = distance / 16400;
			return Time;
		{


	}
