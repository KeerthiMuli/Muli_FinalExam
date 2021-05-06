/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;
/**
 *
 * @author Keerthi Muli
 */
public class RecursionExampleDriver1 {

    /**
     * @param args the command line arguments
     */
    
private static int times=0; 
    
public static void RecursionDisplay(){  
times++;  
if(times<=10){  
System.out.println("Recursive function has run for "+times);  
RecursionDisplay();  
}  

    } 

public static int InfiniteRecursionDisplay(){  
System.out.println("InfiniteRecursionDisplay");  
return InfiniteRecursionDisplay();  
}
  
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Answer for question 10: Keerthi Muli"); 
        RecursionDisplay();
        InfiniteRecursionDisplay();
    }
    
}
