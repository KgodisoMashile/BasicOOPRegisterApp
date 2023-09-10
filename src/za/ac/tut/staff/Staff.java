package za.ac.tut.staff;

public class Staff 
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
    public Staff(String name, String staffNo) {
        this.name = name;
        this.staffNo = staffNo;
    }
    //getters and setters methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    
    //to string method
    private boolean isValidStaffNo(String staffNo)
   {
       
   }        
    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", staffNo=" + staffNo + '}';
    }
    
}
