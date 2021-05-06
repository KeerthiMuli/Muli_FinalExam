package question12;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keerthi Muli
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee(1, "Keerthi", 10000);
		Employee e2 = new Employee(2, "Sritha", 20000);
		Employee e3 = new Employee(3, "Arathi", 130000);
		Employee e4 = new Employee(4, "Anjali", 40000);
		Employee e5 = new Employee(5, "Esha", 50000);

		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(e2);
		eList.add(e4);
		eList.add(e1);
		eList.add(e5);
		eList.add(e3);
             System.out.println("Answer for question 12: Keerthi Muli"); 
             System.out.println("This is Original List");
             for (Employee e : eList) {
			System.out.println(e);
		}
            Collections.sort(eList);
            System.out.println("This is natural order (empId number) ");
            printEmployeeList(eList);
            System.out.println("This is sorting by Salary"); 
             Collections.sort(eList, new Comparator<Employee>() {
           @Override
	public int compare(Employee o1, Employee o2) {
		Integer i3=o1.getEmpSalary();
		Integer i4=o2.getEmpSalary();	
		return (i3.compareTo(i4));
	}

    });
           printEmployeeList(eList);
       System.out.println("This is sorting by Name");
           Collections.sort(eList, new Comparator<Employee>() {
           @Override
	public int compare(Employee o1, Employee o2) {
		String i3=o1.getEmpName();
		String i4=o2.getEmpName();
		return (i3.compareTo(i4));
}
    });
     
            printEmployeeList(eList);
   
    
}
     private static void printEmployeeList(List<Employee>empLIst){
        for(Employee e: empLIst){
            System.out.println(e);
        }
        
    }
}


