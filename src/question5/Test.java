/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Keerthi Muli
 */
public class Test {

	public static void main(String[] args) {

		ComparableCircle c1 = new ComparableCircle(6);
		ComparableCircle c2 = new ComparableCircle(4);
	
               System.out.println("Answer for question 5: Keerthi Muli");
                int result =c1.compareTo(c2);
                
                if(result==-1){
                    System.out.println("Circle C1 is having highest Area");
                }
                else if(result==0){
                     System.out.println("Area are same");
                }
                else{
                System.out.println("Circle C2 is having highest Area");
                }
        }    
        }
  


