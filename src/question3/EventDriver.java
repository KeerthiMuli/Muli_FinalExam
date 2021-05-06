/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Keerthi Muli
 */
public class EventDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Event eve = new Event(1500,"100");
        CulturalEvent  culeve = new 
        CulturalEvent("Kareena","Kapoor",150000,50000,1500,"100");
        System.out.println("Answer for question 3: Keerthi Muli");
 //polymorphic substitution or upcasting
        eve=culeve;
    //down casting
        culeve= (CulturalEvent)eve;
        System.out.println(culeve);
        
    }
    
}
