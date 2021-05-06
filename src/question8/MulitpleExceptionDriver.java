/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import question9.EndException;

/**
 *
 * @author Keerthi Muli
 */
public class MulitpleExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,
            CheckedException  {
        String s1="Hello";
        // TODO code application logic here
        System.out.println("Answer for question 8: Keerthi Muli");
        
        try{
         Scanner sc = new Scanner(new File("File.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
     Scanner s = new Scanner(System.in);
                System.out.print("Please enter an text: ");
                String str =s.nextLine();

                try {
                    if(str.equalsIgnoreCase(s1)){
		throw new CheckedException("This is CheckedException");	
                    }
                }
                catch(CheckedException e){
                    System.out.println(e);
                }
        
    }
    
}
