package eamondunne.softengassignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * @author eamondunne
 */
public class Course {

    private String courseName;
    private ArrayList<Module> Modules = new ArrayList();
    private ArrayList<Student> Students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;

    /**
     * Constructor for Course
     * @param courseName
     * @param startDate
     * @param endDate
     */
    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Adds Module to Course if not already added. Adds Students of Module to
     * Course if not already added.
     *
     * @param module Module to be added.
     */
    public void addModule(Module module) {
        if (!Modules.contains(module)) {
            Modules.add(module);
            ArrayList<Student> ModuleStudents = module.getStudents();
            for (Student student : ModuleStudents) {
                if (!Students.contains(student)) {
                    Students.add(student);
                    student.addCourse(this);
                }
            }
        }
    }

    /**
     * Adds Student to Course if not already added.
     * @param student
     */
    public void addStudent(Student student) {
        if (!Students.contains(student)) {
            Students.add(student);
        }
    }

    /**
     * Prints list of all currently subscribed students
     */
    public void printStudentUsernames() {
        for (Student student : Students) {
            System.out.println(student.getUserName());
        }
    }
    
    /**
     * Prints details of all currently subscribed students
     */
    public void printStudentDetails() {
        for (Student student : Students) {
            student.printStudentDetails();
        }
    }

    /**
     * Prints list of modules included in course
     */
    public void printModuleList() {
        for (Module module : Modules) {
            System.out.println(module.getModuleDetails());
        }
    }
    
    /**
     * @return Name of Course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Getter Method of Course Start Date.
     * @return start date of course
     */
    public DateTime getStartDate() {
        return this.startDate;
    }

    /**
     * Getter Method of Course End Date.
     * @return end date of course
     */
    public DateTime getEndDate() {
        return this.endDate;
    }
}
