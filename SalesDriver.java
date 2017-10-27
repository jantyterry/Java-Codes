/**
Christopher Cornwall
November 2 2011
vo.1
*/

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;


public class SalesDriver {

        public static void main (String[] args) throws IOException
        
           {

         File userpass = new File("password.txt");
         Scanner inputFile =  new Scanner(userpass);
         
         String pass = inputFile.nextLine();
          
          inputFile.close();
      
      int tries = 0;

      while ( tries <= 3)  
     {
    

            double userSales;
            double userAdvance;
            String inputPassword;
    
         inputPassword = JOptionPane.showInputDialog("Please enter your correct password.");

      if (inputPassword.equalsIgnoreCase(pass))
         
           {
            
                JOptionPane.showMessageDialog(null, " this is a program that will calculate your pay base on your sales and advance taken.");

                 userSales = Double.parseDouble( JOptionPane.showInputDialog("enter the amount of sales you made."));
      
                 userAdvance = Double.parseDouble( JOptionPane.showInputDialog("enter the advance you recieved."));
          
                  SalesCommision Jane = new SalesCommision(userSales , userAdvance);
            
      
                  JOptionPane.showMessageDialog(null, " The sales you made was:" + Jane.getSales());
                  JOptionPane.showMessageDialog(null, " The advance you recieved was:" + Jane.getAdvance());
                  JOptionPane.showMessageDialog(null, " The pay you will get is:" + Jane.getPay());
                break;
            }

       else
            {
              JOptionPane.showMessageDialog(null, " password is incorrect.");
              tries++;
            }
      
       }
           
         
           }

}