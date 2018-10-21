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
public class ModuleTest {
    
    DateTime sampleDOB = new DateTime(1996, 07, 22, 4, 20);
    
    Student student1 = new Student("Philip", 18, sampleDOB);
    Student student2 = new Student("Algernon", 12, sampleDOB);
    Student student3 = new Student("Augusta", 90, sampleDOB);
    
    Module module1 = new Module("Programming 1", "CT101");
    Module module2 = new Module("Computer Systems", "CS102");
    
    public ModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = student1;
        Module instance = module1;
        boolean expResult = true;
        boolean result = instance.addStudent(student);
        assertEquals(expResult, result);
    }

    /**
     * Test of printStudentList method, of class Module.
     */
    @Test
    public void testPrintStudentList() {
        System.out.println("printStudentList");
        Module instance1 = module1;
        Module instance2 = module2;
        instance1.addStudent(student1);
        instance1.addStudent(student2);
        instance1.printStudentList();
    }
    
}
