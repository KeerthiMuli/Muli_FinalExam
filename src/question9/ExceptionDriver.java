/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class ExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EndException, 
            FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for question 9: Keerthi Muli"); 
        try(Scanner file = new Scanner(new File("fileName.txt"))){
            if (!file.hasNextLine()) {
                throw new EndException("Checked Exception: "
                        + "Reached End Of File");        
    }
        }
    catch(EndException e){
                    System.out.println(e);
                    }

       
    try(Scanner file2 = new Scanner(new File("fileName2.txt"))){
            if (file2.hasNextLine()) {
                throw new EndException("UnChecked Exception: "
                        + "Its Starting Of File");        
    }
        }
    catch(EndException e){
                    System.out.println(e);
                    }

    }
    
}  

    


