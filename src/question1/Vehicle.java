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
public abstract class Vehicle {

    private static boolean engineStatus;

    public Vehicle(boolean engineStatus) {
        this.engineStatus=engineStatus;
    }  
    public  abstract String vehicleColour();
    public abstract String numberOfTires(int tyres);
    public String Engine() {
		       if (engineStatus == true)
		            return "The engine is already on.";
		       else {
		           engineStatus = false;
		           return "The engine is now on.";
		       }
		    }

    @Override
    public String toString() {
        return vehicleColour()+"\n"+numberOfTires(4)+"\n"+Engine();
    }

  
}
