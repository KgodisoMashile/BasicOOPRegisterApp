package ticketsapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import za.ac.tut.staff.Staff;
import za.ac.tut.staffexception.StaffException;
import za.ac.tut.staffmanager.StaffManager;

public class TicketsApp {

    public static void main(String[] args) 
    {
        //declarations
        Staff staff;
        String staffName,staffNo;
        int option;
        File file=new File("ticketslist.txt");
        StaffManager sm=new StaffManager();
        Queue <Staff> staffMembers=new LinkedList<>();
        
        //controlling the menu
        option=menu();
        try {
        while(option!=4)
        {
            if(option==1)
           {
                
                    //prompting user entry
                    staffName=JOptionPane.showInputDialog(null,"Please enter your name","Name entry",JOptionPane.PLAIN_MESSAGE);
                    staffNo=JOptionPane.showInputDialog(null,"Please enter your staff number","Staff number entry",JOptionPane.PLAIN_MESSAGE);
                    
                    //creating a staff object
                    staff=new Staff(staffName,staffNo);
                    //adding the staff obect to the Queue
                    sm.addStaff(staff, file);
                    
                    //prompting re-entry
                    option=menu();
               
            }
            else if(option==2)
            {
                staffMembers=sm.getAllStaff();
                //displaying all the staff memebers in the list
                displayList(staffMembers);
                 //prompting re-entry
               option=menu();
            }  
            else if(option==3)
            {
                //displaying all the staff members with tickets
                displayAllStaff(file);
                 //prompting re-entry
               option=menu();
            }
            else
            {   
                //control invalid entry
                JOptionPane.showMessageDialog(null, "You have made an invalid entry, please enter again","Invalid entry",JOptionPane.ERROR_MESSAGE);
               //prompting re-entry
               option=menu();
            }    
        }    
         } catch (StaffException ex)
         {
                  JOptionPane.showMessageDialog(null, ex.getMessage(),"Error Message",JOptionPane.ERROR_MESSAGE);
          } catch (IOException ex) 
          {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error Message",JOptionPane.ERROR_MESSAGE);
            }
        
       
    }
    
    //helper methods
    private static void displayList(Queue<Staff> staffMembers)
    {
        String name,staffNo,disp="";
        for(Staff staff: staffMembers)
        {
            name=staff.getName();
            staffNo=staff.getStaffNo();
            
            disp=disp.concat("The staff memeber's name is "+name+"\n"+
                                        "The staff memeber's staff number is "+staffNo+"\n\n");
        }    
        //displaying everything in the queue
        JOptionPane.showMessageDialog(null,disp,"Alll the staff members",JOptionPane.INFORMATION_MESSAGE);
    }
    private static int menu()
    {
        //declarations
        String disp="",opt;
        int option;
        disp=disp.concat("Please select a menu below\n"+
                               "1.To add a staff to the list of tickets\n"+
                               "2.To get the lsit of all the studnets\n"+
                               "3.View all the staff memebers who got the tickets\n"+
                               "4.Exit");
        opt=JOptionPane.showInputDialog(null,disp,"Menu selection",JOptionPane.INFORMATION_MESSAGE);
        //parsing the string value to an integer
        option=Integer.parseInt(opt);
        
        return option;
    }
    
    private static void displayAllStaff(File file) throws IOException
    {
        //declarations
        String disp="",data;
        //contructing a buffered reader
        BufferedReader br=new BufferedReader(new FileReader(file));
           data=br.readLine();
       //reading from the file
       while(data!=null)
       {
           //putting the values in order
           disp=disp.concat(data+"\n");
       }   
       
       br.close();
       //displaying everything
       JOptionPane.showMessageDialog(null, disp,"The lsit of staff members",JOptionPane.INFORMATION_MESSAGE);
    }      
       
}
