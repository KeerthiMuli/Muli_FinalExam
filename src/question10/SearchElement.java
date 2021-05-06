/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
/**
 *
 * @author Keerthi Muli
 */
public class SearchElement {

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      String searchString="";
	ArrayList<String> arrayList = new ArrayList<String>();
	 
	arrayList.add("Kansas");  
	arrayList.add("Maryvilley");
	arrayList.add("Utah"); 
	arrayList.add("Branson"); 
	arrayList.add("Jackson City"); 
        System.out.println("Answer for question 10: Keerthi Muli"); 
	 System.out.println(search("Branson",arrayList));
	}
         
	public static String search(String searchString, ArrayList<String> aList)
	{
	 
	boolean found = false;
        int pos=0;
	for (String s: aList){
	
	if (s.equalsIgnoreCase(searchString))
	 {
	    return searchString + " City is found at index "+pos ;
	 }
	
	 pos++;
                 }
        return(searchString+" City is not found");
	}

        }
        




      
   
    
    

