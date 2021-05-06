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
public class AssociateProfessor extends Professor implements Department,
        Qualification {
    private int numberOfHours;
    private double costPerHour;

    public AssociateProfessor(int numberOfHours, int costPerHour, int prof_Id, 
            String prof_First_Name, String prof_Last_Name) {
        super(prof_Id, prof_First_Name, prof_Last_Name);
        this.numberOfHours = numberOfHours;
        this.costPerHour = costPerHour;
    }
    
    @Override
    public String getProf_Full_Name() {
        return super.getProf_Last_Name()+ ","+super.getProf_First_Name();
    }

    @Override
    public String getDepartmentName() {
        return "ECE";
    }
    @Override
    public String getDepartmentDetails(){
        return "Dept_Id: "+DEPARTMENT_ID+", DepartmentName: "+getDepartmentName();
    }

    public double calcSalary(){
        return numberOfHours * costPerHour;
    }

    @Override
    public String toString() {
        return super.toString()+", Degree: "+DEGREE+", Salary=" + calcSalary();
    }
    
    
}
