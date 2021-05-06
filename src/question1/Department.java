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
public interface Department {
    public static final String DEPARTMENT_ID = "1011_ECE_345";
    abstract String getDepartmentName();
    default String getDepartmentDetails(){
        return "This method is used to display Department details";
    }
     
     
    
}
