/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
	    int index;
		
		int [] array = new int[100];                      
		for (int a = 0; a < array.length; a++) {
		   int j=(int) (Math.random()*100);
			array[a] = j;
		}
                 System.out.println("Answer for question 7: Keerthi Muli");
		Scanner s =new Scanner(System.in);
                System.out.print("Enter index of the array:  ");

		try {
	    index=s.nextInt();
	    System.out.println("Value at given index is "+array[index]);
            
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
			
		}
		
		
	}
	
	
}

    
    

