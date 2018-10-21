/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamondunne.softengassignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * @author eamondunne1
 */

//A course programme class containing course name (CS & IT or ECE, etc.), list of
//modules, list of students that are enrolled, academic start date and end date.
//Start and end dates should use Joda Time classes (i.e. DateTime), which must be
//added as a project dependency
public class Course {
    private String courseName;
    private ArrayList<Module> Modules = new ArrayList();
    private ArrayList<Student> Students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public void addModule(Module module){
        if (!Modules.contains(module)){
            Modules.add(module);
            ArrayList<Student> ModuleStudents = module.getStudents();
            for(Student student : ModuleStudents){
                if (!Students.contains(student)){
                    Students.add(student);
                }
            }
        }
    }
    public void addStudent(Student student){
        if (!Students.contains(student)){
            Students.add(student);
        }
    }
    public void printStudentList(){
        for (Student student : Students) {
            System.out.println(student.getUserName());
        }
    }
    public void printModuleList(){
        
    }
    
    public DateTime getStartDate(){
        return this.startDate;
    }
    public DateTime getEndDate(){
        return this.endDate;
    }
}
