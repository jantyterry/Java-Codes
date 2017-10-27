/**
Christopher Cornwall
Home Work
November 11 2011
*/

import java.util.Scanner;

	public class InternetBillSavingDriver{

		public static void main (String[] args) {

		System.out.println("A = Represent first Package  / B = Represent second Package / C = Represent third Package"); 
		
		Scanner keyboard = new Scanner(System.in);

		double userhours;
		String userpack;
		
		
		System.out.println("Please enter your pack");
		userpack = keyboard.nextLine();

		System.out.println("Please enter the amount of hours");
		userhours = keyboard.nextDouble();
		
		InternetBillSaving Xaria  = new InternetBillSaving(userhours, userpack);
		
		
		System.out.println("The amount of hours you used is " + Xaria.getHours());
		System.out.println("Your monthly Bill is $" + Xaria.getMonthlyBill());
		System.out.println("You choose pack " + Xaria.getPack());


		if(Xaria.getSavingB() > 0)
		{
		System.out.println("The amount a customer would save if he/she purchase package B is $" + Xaria.getSavingB());
		}

		if(Xaria.getSavingC() > 0)
		{
		System.out.println("The amount a customer would save if he/she purchase package C is $" + Xaria.getSavingC());
		}


	}
}