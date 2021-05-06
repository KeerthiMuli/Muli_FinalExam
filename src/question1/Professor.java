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
public abstract class Professor {
    private int prof_Id ;
    private String prof_First_Name;
    private String prof_Last_Name;

    public Professor(int prof_Id, String prof_First_Name, String prof_Last_Name){
        this.prof_Id = prof_Id;
        this.prof_First_Name = prof_First_Name;
        this.prof_Last_Name = prof_Last_Name;
    }


    public  int getProf_Id(){
        return prof_Id;
    };

    public String getProf_First_Name() {
        return prof_First_Name;
    }

    public String getProf_Last_Name() {
        return prof_Last_Name;
    }

    public abstract String getProf_Full_Name();
    
    @Override
    public String toString() {
        return "prof_Id=" + prof_Id + ", prof_Name=" + 
               getProf_Full_Name() ;
    }
    
}
