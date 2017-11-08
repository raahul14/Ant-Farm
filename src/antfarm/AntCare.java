//********************************************************************************
// FIU PANTHERID: 6067726
// CLASS: COP 2210 – Fall 2017
// ASSIGNMENT # 2
// DATE: 10/12/2017
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package antfarm;

import javax.swing.JOptionPane;

public class AntCare {
  
 public static void main(String[] args) {
 
     
     AntFarm antFarm1 = new AntFarm();
     
     antFarm1.breed();
     if(antFarm1.getFedDays() > antFarm1.lifeSpan)
        {
            antFarm1.queenSick();
        }
     
     if("Yes".equals(antFarm1.getExpand()))
        antFarm1.expandColony();
     else
        antFarm1.notExpand();
         
         JOptionPane.showMessageDialog(null,"Queen’s Name: "+antFarm1.getQueenName()+
         "\nAnt Colony Name: "+antFarm1.getColonyName()+
         "\nCaretaker Name: "+antFarm1.getCareTakerName()+
         "\nStarting Size: "+antFarm1.getStartSize()+
         "\nThey were fed "+antFarm1.getFedDays()+" days"+
         "\nRequested number of times to breed: "+antFarm1.getBreedDays()+
         "\nThey were successfully bred "+antFarm1.getSBredDays()+" times"+
         "\nDid the queen get sick? "+antFarm1.getIfSick()+
         "\nWhether the colony was expanded: "+ antFarm1.getExpand()+
         "\nWas a new queen born? "+antFarm1.getIfNewQueen()+
         "\nFinal number of ants in the colony: " + antFarm1.getSize());
           
        
    }
    
      
    
                    
            


}
