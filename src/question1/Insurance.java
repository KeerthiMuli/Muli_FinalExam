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
public interface Insurance {
    public static final String INSURANCE_ID = "1012344_INN";
     abstract String InsurancePlan(); 
     default String getInsuranceDetails(){
        return "This method is used to display Insurance Details";
    }    
    
}
