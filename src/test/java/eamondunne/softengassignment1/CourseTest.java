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
public class CourseTest {
    
    DateTime sampleDOB = new DateTime(1996, 07, 22, 4, 20);
    
    DateTime startDate = new DateTime(2017, 9, 1, 0, 0);
    DateTime endDate = new DateTime(2018, 4, 30, 0, 0);
    
    Student student1 = new Student("Philip", 18, sampleDOB);
    Student student2 = new Student("Algernon", 12, sampleDOB);
    Student student3 = new Student("Augusta", 90, sampleDOB);
    Student student4 = new Student("Hank", 4, sampleDOB);
    
    Module module1 = new Module("Programming 1", "CT101");
    Module module2 = new Module("Computer Systems", "CS102");
    
    Course course1 = new Course("CS&IT", startDate, endDate);
    
    public CourseTest() {
        
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
        course1.printStudentDetails();
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = course1;
        String expResult = "CS&IT";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = student4;
        Course instance = course1;
        instance.addStudent(student);
    }

    /**
     * Test of printStudentUsernames method, of class Course.
     */
    @Test
    public void testPrintStudentUsernames() {
        System.out.println("printStudentUsernames");
        
        Course instance = course1;
        /* Add Student if not already been added */
        instance.addStudent(student1);
        instance.printStudentUsernames();
    }

    /**
     * Test of printModuleList method, of class Course.
     */
    @Test
    public void testPrintModuleList() {
        System.out.println("printModuleList");
        Course instance = course1;
        instance.addModule(module1);
        instance.printModuleList();
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = course1;
        DateTime expResult = startDate;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = course1;
        DateTime expResult = endDate;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of printStudentDetails method, of class Course.
     */
    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Course instance = course1;
        instance.printStudentDetails();
    }

       
}
