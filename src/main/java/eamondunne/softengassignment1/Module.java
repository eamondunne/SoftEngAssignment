/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamondunne.softengassignment1;

import java.util.ArrayList;

/**
 *
 * @author eamondunne1
 */
public class Module {
    private String moduleName;
    private String moduleID;
    private ArrayList<Student> studentList = new ArrayList();
    
    public Module(String moduleName, String moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }
    public boolean addStudent(Student student){
        if(!studentList.contains(student)){
            studentList.add(student);
            student.addModule(this);
        }
        return true;
    }
    public void printStudentList(){
        for (Student student : studentList) {
            System.out.println(student.getUserName());
        }
    }
    public ArrayList<Student> getStudents(){
        return this.studentList;
    }
}
