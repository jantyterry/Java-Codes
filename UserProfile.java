/**
Christopher Cornwall
Home Work
November 11 2011
*/

import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

	public class UserProfile{
		
		public static void main(String[] args) throws IOException{

		String inputpassword;
		String inputusername;
		int number;	
		int tries = 0;
		String username;
		String password;


		
		while ( tries < 3)  
    		 {
    

        	 File userpass = new File("password.txt");
         	 Scanner inputFile =  new Scanner(userpass);

		inputusername = JOptionPane.showInputDialog("Please enter your correct user name.");
		inputpassword = JOptionPane.showInputDialog("Please enter your correct password.");	

		 while (inputFile.hasNext())
		{
	
			username = inputFile.nextLine();
		 	password = inputFile.nextLine();
		
     
        

      if ((inputusername.equalsIgnoreCase(username))&&(inputpassword.equalsIgnoreCase(password)))
	{
		
		Random randomNumbers = new Random();
		number = randomNumbers.nextInt();

		JOptionPane.showMessageDialog(null,"number is " + number);
		System.exit(0);
	}
		}
		
			JOptionPane.showMessageDialog(null, "invalid entry");
			tries++;
            }
              
              
           
	
	
	}
}