/**
Christopher Cornwall
November 8, 2011
*/

import javax.swing.JOptionPane;

public class SoundSpeedDriver {

        public static void main (String[] args)
        
           { 
     
              double UserDistance;
              int UserChose;
             

  JOptionPane.showMessageDialog(null, " This is a program that will calculate the time it takes for sound to tavel in a medium.");

  UserDistance = Double.parseDouble( JOptionPane.showInputDialog("Please a distance in which you want the sound to travel in a medium."));
      
          
   SoundSpeed FirstMaterial = new SoundSpeed(UserDistance);
   
    

  JOptionPane.showMessageDialog(null, "Please choose one of the following medium \n |___Medium__ |___________Speed___________| \n |_1:___Air_____|____1100 feet per second \n |_2:___ Water___|____4900 feet per second \n |_3:__Steel_____|_____16400");
                                       
                UserChose = Integer.parseInt( JOptionPane.showInputDialog("please chose a material from the menu base on the index number."));

         switch ( UserChose) {

 case 1:

 {JOptionPane.showMessageDialog(null, " The time is:" + FirstMaterial.getSpeedInAir());
 JOptionPane.showMessageDialog(null, " The distance the sound travel was:" + FirstMaterial.getDistance());}
 break;

 case 2:

 {JOptionPane.showMessageDialog(null, " The time is:" + FirstMaterial.getSpeedInWater());
 JOptionPane.showMessageDialog(null, " The distance the sound travel is was:" + FirstMaterial.getDistance());}
 break;

 case 3:

 {JOptionPane.showMessageDialog(null, " The time is:" + FirstMaterial.getSpeedInSteel());
 JOptionPane.showMessageDialog(null, " The distance the sound travel was:" + FirstMaterial.getDistance());}
 break;

 default:

  {JOptionPane.showMessageDialog(null, " the number you entered in not a option.");}
    break;
   
    }

  }

}

 
            