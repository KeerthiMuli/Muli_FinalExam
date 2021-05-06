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
public interface Registration {
    public static final String REGISTRATION_ID = "2032344_RDD";
    abstract String registeredDate();
    default String getRegistrationDetails(){
        return "This method is used to display Registration details";
    }
         
}
