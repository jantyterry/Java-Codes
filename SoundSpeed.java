/**
Christopher Cornwall
November 8, 2011
*/

public class SoundSpeed {

   private double distance;
   private double time;

public SoundSpeed(double d)

  {
    distance = d;
  }

public double getSpeedInAir()
  {
    time = distance /1100;
    return time;
  }
public double getSpeedInWater()
  {
    time = distance /4900;
    return time;
  }
public double getSpeedInSteel()
  {
    time = distance /16400;
    return time;
  }
public double getDistance()
  {
    return distance;
  }


}



