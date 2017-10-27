/**
Christopher Cornwall
Home Work
November 11 2011
*/

import java.util.Scanner;

	public class InternetBillDriver{

		public static void main (String[] args) {

		System.out.println("A = Represent first Package  / B = Represent second Package / C = Represent third Package"); 
		
		Scanner keyboard = new Scanner(System.in);

		double userhours;
		String userpack;
		
		
		System.out.println("Please enter your pack");
		userpack = keyboard.nextLine();

		System.out.println("Please enter the amount of hours");
		userhours = keyboard.nextDouble();
		
		InternetBill aria  = new InternetBill(userhours, userpack);
		
		
		System.out.println("The Package you choose is " + aria.getPack());
		System.out.println("The amount of hours you used is " + aria.getHours());
		System.out.println("Your monthly Bill is $" + Xaria.getMonthlyBill());

	}
}


		
		

			