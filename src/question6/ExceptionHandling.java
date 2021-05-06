/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Keerthi Muli
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int [] i= new int[3];
		i[0]=1;
		i[1]=2;
		i[2]=3;
                System.out.println("Answer for question 6: Keerthi Muli");
                try{
                 String location="C:/Users/Keerthi/Desktop/java";
		File fileObj= new File(location);
                fileObj.createNewFile();
                
                }
                catch(IOException e){
                   System.out.println("Checked Exception: "+e);
                }
		try {
		i[3]=4;
		
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("UnChecked Exception: "+e);
		}
		
	}


    }
    
