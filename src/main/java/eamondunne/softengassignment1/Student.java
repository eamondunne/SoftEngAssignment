package eamondunne.softengassignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 *
 * @author eamondunne
 */
public class Student {

    String name;
    int age;
    DateTime DOB;
    int ID;
    String userName;
    ArrayList<Module> Modules = new ArrayList();
    Course course;

    /**
     * @param name
     * @param ID
     * @param DOB
     */
    public Student(String name, int ID, DateTime DOB) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.age = this.getAge();
        this.userName = this.getUserName();
    }

    /**
     * @return The username of the student
     */
    String getUserName() {
        return name + age;
    }

    /**
     * Computes the time between the Student's Date of Birth and current Date
     *
     * @return The Age of the student
     */
    int getAge() {
        Years TimeDiff = Years.yearsBetween(this.DOB, new DateTime());
        return TimeDiff.getYears();
    }

    /**
     * Adds the current student to the passed module if they haven't already
     * been added
     *
     * @param module
     */
    public void addModule(Module module) {
        /* Adds Student to Module if they haven't already been added */
        if (!Modules.contains(module)) {
            Modules.add(module);
            module.addStudent(this);
        }
    }

    /**
     * Subscribes the student to the course if they have none.
     *
     * @param course The course to be added to
     * @return false if the student is already subscribed to a different course
     */
    public boolean addCourse(Course course) {
        if (course != null) {
            this.course = course;
            return true;
        } else {
            return false;
        }
    }

    public void printStudentDetails() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + ID);
        System.out.println("Username: " + userName);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Modules: ");
        for (Module module : Modules) {
            System.out.println(module.getModuleDetails());
        }
        System.out.println("------------------");
    }
}
