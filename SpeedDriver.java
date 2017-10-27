/**
Christopher Cornwall
Home Work
November 11 2011
*/

import java.util.Scanner;

	public class SpeedDriver{

		public static void main (String[] args) {

		System.out.println("1 = speed of sound in Air / 2 = Speed of sound in Water / 3 = Speed of sound in Steel"); 
		
		Scanner keyboard = new Scanner(System.in);

		double userdistance;
		int choice;
		
		System.out.println("Please enter the distance the sound will travel");
		userdistance = keyboard.nextDouble();
		
		
		Speed Mediums = new Speed(userdistance);

		System.out.println("Please enter your choice");
		choice = keyboard.nextInt();
		

			switch (choice){
		
		case 1:
		{
			System.out.println("Time for sound to travel through Air with a speed of 1100ft/sec " + Mediums.getSpeedInAir());
			System.out.println("Distance" + Mediums.getDistance());
		}
		
			break;
		

		case 2:
		{
			System.out.println("Time for sound to travel through Water with a speed of 4900ft/sec " + Mediums.getSpeedInWater()); 
			System.out.println("Distance" + Mediums.getDistance());
		}
	
			break;

		case 3:
		{
			System.out.println("Time for sound to travel through Steel with a speed of 16400ft/sec " + Mediums.getSpeedInSteel());
			System.out.println("Distance" + Mediums.getDistance());
		}

			break;

		default:
		{
			System.out.println("The characher you enter is not valid entry");
		}
			break;
		}

	}
}
		

