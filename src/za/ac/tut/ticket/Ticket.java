package za.ac.tut.ticket;

public class Ticket 
{
    //private fields
    private String name;
    private String staffNo;
    
    //default constructor

    public Ticket() 
    {
        this.name="";
        this.staffNo="";
    }
    
    //constructor
    public Ticket(String name, String staffNo) {
        this.name = name;
        this.staffNo = staffNo;
    }
    //getters and setters methods
    
    
}
