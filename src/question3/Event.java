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
public class Event {
    private int EntryFee;
    private String numberOfPeople;


    public Event(int EntryFee, String numberOfPeople) {
        this.EntryFee = EntryFee;
        this.numberOfPeople = numberOfPeople;
    }


    
    //Type conversion from int to String;
    public String intToString(){
    String convertedEntryFee = String.valueOf(EntryFee);
    return"The convertedEntryFee value from int to String using Type Conversion "
                       + convertedEntryFee;
    } 
    //Type conversion from String to int;
    public String stringToInt(){
    int convertedNumberOfpeople = Integer.parseInt(numberOfPeople);
    return"The convertedNumberOfpeople value from String to int using Type "
            + "Conversion "
                       + convertedNumberOfpeople;
    } 
    @Override
    public String toString() {
        return  intToString()+"\n"+stringToInt();
    }

    
}
