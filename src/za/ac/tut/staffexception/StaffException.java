/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.staffexception;

/**
 *
 * @author Kgodiso
 */
public class StaffException extends Exception{
    public StaffException(String errorMessage)
    {
        //passing the error message to the super class
            super(errorMessage);
    }       
}
