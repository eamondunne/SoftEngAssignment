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

    /**
     *
     * @param moduleName
     * @param moduleID
     */
    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public String getModuleDetails() {
        return moduleID + " - " + moduleName;
    }

    /**
     *
     * @param student
     * @return
     */
    public boolean addStudent(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
            student.addModule(this);
        }
        return true;
    }

    /**
     * Print list of students in module
     */
    public void printStudentList() {
        for (Student student : studentList) {
            System.out.println(student.getUserName());
        }
    }

    /**
     *
     * @return ArrayList of students in module
     */
    public ArrayList<Student> getStudents() {
        return this.studentList;
    }
}
