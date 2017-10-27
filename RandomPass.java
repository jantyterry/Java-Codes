
import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class RandomPass {

	public static void main(String[] args) throws IOException{
	
		int count = 0;
		boolean found = false;
		String username, password;
		Scanner keyboard = new Scanner(System.in);

		while(count < 3)
		{

		System.out.println("enter the username");
		username = keyboard.nextLine();
		
		System.out.println("enter the password");
		password = keyboard.nextLine();

		File fr = new File("password.txt");
     	 	Scanner passFile =  new Scanner(fr);

		while(passFile.hasNext())
		{

			String fileUsername = passFile.nextLine();
			String filePassword = passFile.nextLine();

			if(fileUsername.equalsIgnoreCase(username))

				if(filePassword.equalsIgnoreCase(password))
				{

					Random number = new Random();
					System.out.println("Random Number is: " + number.nextInt());
					found = true;
					break;
				}
	
		}
		passFile.close();
		if(found)
			break;
		
		else
		{
			System.out.println("Sorry, Try Again");
			count++;
		}
		
		}
	}

}
