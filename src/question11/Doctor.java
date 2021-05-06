/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Keerthi Muli
 */
public class Doctor {
   //Attributes declared to store Name of the Doctor and id of the Doctor
	private String doct_Name;
	private int doct_Id;
/*A two argument constructor that initializes the instance variables using 
        the parameters passed.*/
   public Doctor(String doct_Name, int doct_Id) {
        this.doct_Name = doct_Name;
        this.doct_Id = doct_Id;
    }
//Getter method for fetching the Name of the doctor
    public String getDoct_Name() {
        return doct_Name;
    }
//Getter method for fetching the id of the doctor
    public int getDoct_id() {
        return doct_Id;
    }

 /*
*Returns a hash code value for the object
*This is a method provided by java that returns an integer representation of the 
object memory address.
 */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.doct_Name);
        hash = 23 * hash + this.doct_Id;
        return hash;
    }

    /*
    *When the equals() method is overridden, the hashCode() method must be 
    overridden as well.
    *This equals()method checks if the passed object is of type Doctor and if 
    it has same attributes as the current object, they are considered to be equal 
    (return true); otherwise they are not equal (return false).
    */
    @Override
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
                if (this.doct_Id != other.doct_Id) {
            return false;
        }
        if (!Objects.equals(this.doct_Name, other.doct_Name)) {
            return false;
        }
        return true;

    }

//This overriding method returns the details of an doctor.	
  @Override
    public String toString() {
        return "Doctor{" + "Doct_Name=" + doct_Name + ", Doct_id=" + 
                doct_Id + '}';
    }
}

    

