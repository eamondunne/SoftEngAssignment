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
public class StudentTest {
    
    DateTime sampleDOB = new DateTime(1996, 07, 22, 4, 20);
    
    Student student1 = new Student("Philip", 18, sampleDOB);
    Student student2 = new Student("Algernon", 12, sampleDOB);
    Student student3 = new Student("Augusta", 90, sampleDOB);
    
    Module module1 = new Module("Programming 1", "CT101");
    Module module2 = new Module("Computer Systems", "CS102");
    
    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    /**
     * Test of getUserName method, of class Student.
     */
    @org.junit.Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Student instance = student1;
        String expResult = "Philip22";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = student1;
        int expResult = 22;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = module1;
        Student instance = student1;
        boolean expResult = true;
        boolean result = instance.addModule(module);
        assertEquals(expResult, result);
    }
}
