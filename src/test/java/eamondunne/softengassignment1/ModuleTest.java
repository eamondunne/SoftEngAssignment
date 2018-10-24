package eamondunne.softengassignment1;

import java.util.ArrayList;
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

    /**
     * Test of getModuleDetails method, of class Module.
     */
    @Test
    public void testGetModuleDetails() {
        System.out.println("getModuleDetails");
        Module instance = module1;
        String expResult = "CT101 - Programming 1";
        String result = instance.getModuleDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of printStudentDetails method, of class Module.
     */
    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Module instance = module2;
        instance.printStudentDetails();
    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = module1;
        module1.addStudent(student1);
        ArrayList<Student> expResult = new ArrayList();
        expResult.add(student1);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    @Test
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = module1;
        String expResult = "Programming 1";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModuleID method, of class Module.
     */
    @Test
    public void testGetModuleID() {
        System.out.println("getModuleID");
        Module instance = module2;
        String expResult = "CS102";
        String result = instance.getModuleID();
        assertEquals(expResult, result);
    }
    
}
