package za.ac.tut.staff;

import za.ac.tut.staffdatainterface.StaffDataInterface;
import za.ac.tut.staffexception.StaffException;

public class Staff implements StaffDataInterface
{
    //private fields
    private String name;
    private String staffNo;
    
    //default constructor

    public Staff() 
    {
        this.name="";
        this.staffNo="";
    }
    
    //constructor
    public Staff(String name, String staffNo) throws StaffException {
        setName(name);
      setStaffNo(staffNo);
    }
    //getters and setters methods

    public String getName() {
        return name;
    }

    public void setName(String name) throws StaffException 
    {
        if(isValidName(name))
        {    
                this.name = name;
        }
        else
        {
            throw new StaffException(NAME_ERROR);
        }     
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) throws StaffException {
        if(isValidStaffNo(staffNo))
        {   
                this.staffNo = staffNo;
        }       
        else 
        {
            throw  new StaffException(STAFF_NO_ERROR);
            
        }   
    }
    
    private boolean isValidStaffNo(String staffNo)
   {
        boolean isValid=false;
        
        if(staffNo.length()>MIN_STRING_LENG)
        {
            isValid=true;
        }   
        return isValid;
   }        
    
    private boolean isValidName(String name)
    {
        boolean isValid=false;
        
        if(name.length()>MIN_STRING_LENG)
        {
            isValid=true;
        }   
        return isValid;
        
    }
    
    //to string method to show the current state of the back-end class
    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", staffNo=" + staffNo + '}';
    }
    
}
