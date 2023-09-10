package za.ac.tut.staffinterface;

import java.io.File;
import java.io.IOException;
import java.util.Queue;
import za.ac.tut.staff.Staff;

public interface StaffInterface 
{
    public void addStaff(Staff staff,File file) throws IOException;
    public Queue<Staff> getAllStaff();
}
