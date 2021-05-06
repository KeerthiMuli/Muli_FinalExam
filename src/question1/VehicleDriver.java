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
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 1: Keerthi Muli");
        Vehicle veh = new Truck(true);
        System.out.println(veh);
        Registration reg = new Truck(true);
         System.out.println(reg.getRegistrationDetails());
        Insurance ins =new Truck(true);
        System.out.println(ins.getInsuranceDetails());
        
    }
    
}
