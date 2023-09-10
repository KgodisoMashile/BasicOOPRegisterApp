/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.staffmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import za.ac.tut.staff.Staff;
import za.ac.tut.staffinterface.StaffInterface;

/**
 *
 * @author Kgodiso
 */
public class StaffManager implements StaffInterface{
    //private fields
    private Queue<Staff> staffMembers=new LinkedList<>();
    
    //conctructor 
    public StaffManager() 
    {
        
    }

    @Override
    public void addStaff(Staff staff, File file) throws IOException {
        //adding the object to the queue
        staffMembers.add(staff);
        
        //adding the info also to a file
        BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
        
        //opening the file steam
        bw.write(staff.toString());
        
        //going to theer next line before closing the file stream
        bw.newLine();
        
        //closing the file stream
        bw.close();
    }

  
    @Override
    public Queue<Staff> getAllStaff() {
        return staffMembers;
    }
  
 
}
