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
public class ProjectManager extends Manager{
    private double projectId ;
    private int projectBudget;
    private String projectName;

    public ProjectManager(double projectId, int projectBudget, 
            String projectName, String managerFirstName, String managerLastName){
        super(managerFirstName, managerLastName);
        this.projectId = projectId;
        this.projectBudget = projectBudget;
        this.projectName = projectName;
    }
    public String implicitCasting() {
		// convert from int into double type automatically
		double convertedProjectBudget = projectBudget;
		return ("The  convertedProjectBudget value from int to double "
                        + "using implicitCasting: " +
                        convertedProjectBudget);

	}
   public String explicitCasting() {
		// convert double into int type manually
		int convertedProjectId = (int)projectId;
		return("The convertedProjectId value from double to int "
                        + "using explicitCasting: " +
                        convertedProjectId);
	}
    @Override
    public String toString() {
        return implicitCasting()+"\n"+explicitCasting()+"\n"+
                "ProjectName: "+projectName+","+super.toString();
    }
    
    
}
