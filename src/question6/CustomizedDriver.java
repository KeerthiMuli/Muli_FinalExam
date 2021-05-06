/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class CustomizedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CustomizedCheckedException{
        // TODO code application logic here
      
		Scanner s = new Scanner(System.in);
                System.out.println("Answer for question 6: Keerthi Muli");
                System.out.print("Please enter an number: ");
                int i =s.nextInt();
		try {
                    if(i<10){
		throw new CustomizedCheckedException("This is customized "
                        + "checked exception");	
                    }
                }
                catch(CustomizedCheckedException e){
                    System.out.println(e);
                    
                    
                }
                System.out.print("Please enter an number: ");
                int n =s.nextInt();
		try {
                    if(n>10){
		throw new CustomizedUncheckedException("This is customized "
                        + "UnChecked exception");	
                    }
                }
                catch(CustomizedUncheckedException e){
                    System.out.println(e);
                }
	}
}


    
    

