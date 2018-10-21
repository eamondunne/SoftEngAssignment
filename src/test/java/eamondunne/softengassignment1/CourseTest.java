/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamondunne.softengassignment1;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eamondunne1
 */
public class CourseTest {
    
    DateTime sampleDOB = new DateTime(1996, 07, 22, 4, 20);
    
    DateTime startDate = new DateTime(2017, 9, 1, 0, 0);
    DateTime endDate = new DateTime(2018, 4, 30, 0, 0);
    
    Student student1 = new Student("Philip", 18, sampleDOB);
    Student student2 = new Student("Algernon", 12, sampleDOB);
    Student student3 = new Student("Augusta", 90, sampleDOB);
    
    Module module1 = new Module("Programming 1", "CT101");
    Module module2 = new Module("Computer Systems", "CS102");
    
    Course course1 = new Course("CS&IT", startDate, endDate);
    
    public CourseTest() {
    }
    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student2);
        module2.addStudent(student3);
        Module module = module1;
        Module module3 = module2;
        Course instance = course1;
        instance.addModule(module);
        instance.addModule(module3);
        course1.printStudentList();
    }

    /**
     * Test of addStudent method, of class Course.
     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student student = null;
//        Course instance = null;
//        instance.addStudent(student);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of printStudentList method, of class Course.
     */
    @Test
    public void testPrintStudentList() {
        System.out.println("printStudentList");
        Course instance = course1;
        instance.printStudentList();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
