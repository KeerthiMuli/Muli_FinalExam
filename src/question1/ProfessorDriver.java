/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Keerthi Muli
 */
public class ProfessorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Answer for question 1: Keerthi Muli");
          Professor prof = new AssociateProfessor(9,1000,103134,"Varun","Kumar");
          System.out.println(prof);
          Department dep =new AssociateProfessor(9,1000,103134,"Varun","Kumar");
          System.out.println(dep.getDepartmentDetails());
    }
    
}
