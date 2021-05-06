/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author Keerthi Muli
 */
public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private int empSalary;
     public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }
    

   
    @Override
    public String toString() {
return  "empId=" + empId + " empName=" + empName + " empSalary=" + empSalary ;
    }
  @Override
	public int compareTo(Employee o) {
		Employee E1=this;
		Employee E2=o;
		
		Integer i1=E1.getEmpId();
		Integer i2=E2.getEmpId();
		
		return (i1.compareTo(i2));
		
		 
	}

    
}
