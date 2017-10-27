/**
Christopher Cornwall
November 2 2011
vo.1
*/

import javax.swing.JOptionPane;

public class SalesCommisionDriver {

        public static void main (String[] args)
        
           {

            double userSales;
            double userAdvance;
            String password = "my money";
            String inputPassword;

        inputPassword = JOptionPane.showInputDialog("Please enter your correct password.");
    
      if (inputPassword.equals(password))
         
           {
            
                JOptionPane.showMessageDialog(null, " this is a program that will calculate your pay base on your sales and advance taken.");

                 userSales = Double.parseDouble( JOptionPane.showInputDialog("enter the amount of sales you made."));
      
                 userAdvance = Double.parseDouble( JOptionPane.showInputDialog("enter the advance you recieved."));
          
                  SalesCommision Jane = new SalesCommision(userSales , userAdvance);
            
      
           JOptionPane.showMessageDialog(null, " The sales you made was:" + Jane.getSales());
           JOptionPane.showMessageDialog(null, " The advance you recieved was:" + Jane.getAdvance());
           JOptionPane.showMessageDialog(null, " The pay you will get is:" + Jane.getPay());

           

            }

       else
         {
            JOptionPane.showMessageDialog(null, " your password is incorrect");
         }

       System.exit(0);
         
           }

}