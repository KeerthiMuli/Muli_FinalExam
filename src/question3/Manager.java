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
public class Manager {
    private String managerFirstName;
    private String managerLastName;

    public Manager(String managerFirstName, String managerLastName) {
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    @Override
    public String toString() {
        return "ManagerName: "+managerFirstName +" "+managerLastName;
    }
    
}
