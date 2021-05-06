/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Keerthi Muli
 */
public class DoctorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Creating three ojects for Doctor class
        	Doctor d1= new Doctor("Keerthi", 1);
		Doctor d2= new Doctor("Keerthi", 1);
                Doctor d3= new Doctor("Srujala",2);
       System.out.println("Answer for question 11: Keerthi Muli"); 
		System.out.println("*****Using .equals Method *****");
      /*   
      *Using the dot equals method to compare d1 and d2 and printing the booelan. 
       *This would return false if the equals method isn't implemented in the 
        Doctor, as this uses .equals built-in method and if equals is 
        overrided, it will return true because this will consider whether 
                the arguments passed to the object are the same or not.*/
                System.out.println(d1.equals(d2));
     //Using the dot equals method to compare d1 and d3 and printing the booelan 
                System.out.println(d1.equals(d3));
     //Using the dot equals method to compare d2 and d3 and printing the booelan 
                System.out.println(d2.equals(d3));
                System.out.println("**** Using == *****");
  //Using the double equals method to compare d1 and d2 and printing the booelan
                System.out.println(d1==d2);
 //Using the double equals method to compare d1 and d3 and printing the booelan
                System.out.println(d1==d3);
  //Using the double equals method to compare d2 and d3 and printing the booelan
                System.out.println(d2==d3);
   
                System.out.println("*****Using hashcode *****");
     /* This will return two different hascodes for both d1 and d2 as hasCode 
        method is not implemented in the Doctor class, as this uses hasCode 
                built in method and if hasCode method is overrided, same 
                hashCodes for both d1 and d2 are returned*/
                System.out.println(d1.hashCode());
                System.out.println(d2.hashCode());
                System.out.println(d3.hashCode());
	     
	}

}

    
    
