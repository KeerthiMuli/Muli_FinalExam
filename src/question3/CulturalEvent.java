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
public class CulturalEvent extends Event{
    private String eventHostFirstName;
    private String eventHostLastName;
    private long totalIncomeFromEvent;
    private float hostPayment;

    public CulturalEvent(String eventHostFirstName, String eventHostLastName, 
     long totalIncomeFromEvent, float hostPayment, int EntryFee, String 
             numberOfPeople) {
        super(EntryFee, numberOfPeople);
        this.eventHostFirstName = eventHostFirstName;
        this.eventHostLastName = eventHostLastName;
        this.totalIncomeFromEvent = totalIncomeFromEvent;
        this.hostPayment = hostPayment;
    }

    
    public String implicitCasting(){
        // convert from long into float type automatically
		float convertedtotalIncomeFromEvent = totalIncomeFromEvent;
	return ("The  convertedtotalIncomeFromEvent value from long to float "
                        + "using implicitCasting: " +
                        convertedtotalIncomeFromEvent);
    }
    
    public String explicitCasting() {
		// convert double into int type manually
		long convertedHostPayment = (long)hostPayment;
		return("The convertedHostPayment value from float to long "
                        + "using explicitCasting: " +
                       convertedHostPayment );
	}
     @Override
    public String toString() {
        return implicitCasting()+"\n"+explicitCasting()+"\n"+
                "HostName: "+eventHostFirstName+","+eventHostLastName+"\n"+
                        super.toString();
    }
    
}
