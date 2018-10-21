/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamondunne.softengassignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 *
 * @author eamondunne1
 */
public class Student {
    String name;
    int age;
    DateTime DOB;
    int ID;
    String userName;
    ArrayList<Module> Modules = new ArrayList();
       
    public Student(String name, int ID, DateTime DOB){
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.userName = this.getUserName();
        Years age = Years.yearsBetween(this.DOB, new DateTime());
        this.age = age.getYears();
    }
    String getUserName(){
        return name + age;
    }
    int getAge() {
        return this.age;
    }
    public boolean addModule(Module module){
//        System.out.println("In Student.addModule() Function");
        if (!Modules.contains(module)){
            Modules.add(module);
//            System.out.println("Calling Module.addStudent(this) from within Student");
            module.addStudent(this);
        }
        return true;
    }
}
