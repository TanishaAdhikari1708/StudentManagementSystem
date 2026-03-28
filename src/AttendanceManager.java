// src/AttendanceManager.java
import java.util.ArrayList;

/**
 * AttendanceManager handles student attendance tracking.
 * It allows marking students present and generating attendance reports.
 */
public class AttendanceManager {
    private ArrayList<Student> presentStudents;

    public AttendanceManager() {
        presentStudents = new ArrayList<>();
    }

    /**
     * Marks a student as present if not already marked.
     * @param student Student object to mark present
     */
    public void markPresent(Student student) {
        if (!presentStudents.contains(student)) {
            presentStudents.add(student);
            System.out.println(student.getName() + " marked present.");
        } else {
            System.out.println(student.getName() + " is already marked present.");
        }
    }

    /**
     * Prints the list of students who are present.
     */
    public void printAttendance() {
        System.out.println("===== Attendance List =====");
        for (Student s : presentStudents) {
            System.out.println(s);
        }
        System.out.println("===========================");
    }

    /**
     * Generates a detailed attendance report.
     */
    public void generateReport() {
        System.out.println("====== Attendance Report ======");
        System.out.println("Total Students Present: " + presentStudents.size());
        System.out.println("-------------------------------");
        for (int i = 0; i < presentStudents.size(); i++) {
            System.out.println((i+1) + ". " + presentStudents.get(i));
        }
        System.out.println("===============================");
    }
}