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
public class Truck extends Vehicle implements Insurance,Registration {

    public Truck(boolean engineStatus) {
        super(engineStatus);
    }
    
    @Override
    public String vehicleColour() {
     return "Truck Color is Red";
    }

    @Override
    public String numberOfTires(int tyres) {
       return "This Truck contains "+tyres+" tyres";
    }

    @Override
    public String registeredDate() {
        return "Registered Date:04/26/2020";
    }
    @Override
    public String InsurancePlan(){
      return "This is an one Year Plan";
}
    @Override
    public String getRegistrationDetails(){
       return "RegId: "+REGISTRATION_ID+", "+registeredDate();     
    }
     @Override
    public String getInsuranceDetails(){
       return "Insurance Id: "+INSURANCE_ID+", "+"InsurancePlan: "+
               InsurancePlan() ;  
    }
    
    @Override
    public String toString(){  
        return super.toString();
      
    }

}
