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
public class ManagerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Manager man= new Manager("Vani","Swamy");
 ProjectManager proj = new ProjectManager(102344,1000000,"IKEA","Vani","Swamy");
 
 System.out.println("Answer for question 3: Keerthi Muli");
 //polymorphic substitution or upcasting
 man=proj;
 
 //down casting
 proj = (ProjectManager)man;
 System.out.println(proj);
    }
    
}
