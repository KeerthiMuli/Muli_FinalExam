/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Keerthi Muli
 */
public class ThrowAndThrowsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Answer for question 9: Keerthi Muli");    
        try{
        Thread.sleep(2000);
       throw new InterruptedException("This is an custom messege for "
               + "InterruptedException");
        }catch(InterruptedException e){
           System.out.println(e);     
        }
        int a = 2, b = 10;
        int c = b%a;
       try{
    
       if(c == 0){
       throw new ArithmeticException ("This is an custom messege for "
               + "ArithmeticException ") ;
       }
    }
       catch (ArithmeticException e){
             System.out.println(e);
             }
    }
   
}
