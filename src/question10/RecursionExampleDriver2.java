/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class RecursionExampleDriver2 {

   public static int power(int x, int n){
    if (n == 0)   
      return  1;
   else      
      return (x * power ( x , n-1)); 

}

   public static int Infinitepower(int x, int n){
       while(true){
           System.out.println("Infinite power");
       return (x * Infinitepower(x , power ( x , n-1)));  
       }
       }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 10: Keerthi Muli"); 
        System.out.print("Please enter integer and to what power you "
                + "want the result: ");
       Scanner S= new Scanner(System.in);
       int x=S.nextInt();
       int n=S.nextInt();
       power(x, n);
  System.out.println("The result of "+x +" to power of "+n +" is "+power(x, n));
        System.out.println(Infinitepower(x, n));
        
    }

}