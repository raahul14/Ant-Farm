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
import java.util.Random;

public class AntFarm {

    final int lifeSpan = 10;
    private String queen =  JOptionPane.showInputDialog("What do you want to name the queen?");
    private String colony =  JOptionPane.showInputDialog("What do you want to name her colony?");
    private String caretaker =  JOptionPane.showInputDialog("Who will be the caretaker?");
    private int startsize =  Integer.parseInt(JOptionPane.showInputDialog("How many bees do you want to start with?"));
    private int fedDays = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want to feed the bees?"));
    private int breedDays = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want to breed the bees?"));
    private int sbredDays = breedDays;//succesfully bred days
    private String ifExpand = JOptionPane.showInputDialog("Do you want to expand the colony?");
    private String ifSick = "No";
    private String ifNewQueen = "No";
    private int size = startsize;
    
    public String getQueenName()
    {
        return queen;
    }
    public String getColonyName()
    {
        return colony;
    }
    public String getCareTakerName()
    {
        return caretaker;
    }
    public int getStartSize()
    {
        return startsize;
    }
       public int geSize()
    {
        return size;
    }
    public int getFedDays()
    {
        return fedDays;
    }
    public int getBreedDays()
    {
        return breedDays;
    }
    public int getSBredDays()
    {
        if(fedDays>=breedDays)
        {
            sbredDays = breedDays;
        }else
            sbredDays = fedDays;
      
        return sbredDays ;
    }
    public String getExpand()
    {
        return ifExpand;
    }
    public void queenSick()
    {
        if(this.getFedDays() > lifeSpan)
        {
            size = size/2;
            ifSick = "Yes, "+size+" ants died";
        }
        else
            ifSick = "No";
    }  
    public String getIfSick()
    {
        return ifSick;
    }
    public void breed()   
    {
    if(fedDays>=breedDays)
        {
            size = size*breedDays*3;
        }
    }
    public String expandColony()
    {
        Random r = new Random();
        int x = r.nextInt(2);
        if(x==0)
        {
            queen = queen+" 2.0";
            ifNewQueen = "Yes, Her Name is "+queen;
        }else
            ifNewQueen = "No";
         return queen;
    }
     
    public String notExpand()
    {
          
        Random r = new Random();
        int x = r.nextInt(10);
        if(x==0)
            queen = queen+" 2.0";
             
       return queen;
    }
    public String getIfNewQueen()
    {
        return ifNewQueen;
    }
    public int getSize()
    {
        return size;
    }
}
