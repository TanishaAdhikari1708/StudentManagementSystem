// src/AttendanceManager.java
import java.util.ArrayList;

public class AttendanceManager {
    private ArrayList<Student> presentStudents;

    public AttendanceManager() {
        presentStudents = new ArrayList<>();
    }

    // Mark a student present by Student object
    public void markPresent(Student student) {
        if (!presentStudents.contains(student)) {
            presentStudents.add(student);
            System.out.println(student.getName() + " marked present.");
        } else {
            System.out.println(student.getName() + " is already marked present.");
        }
    }

    // Print all present students
    public void printAttendance() {
        System.out.println("Attendance List:");
        for (Student s : presentStudents) {
            System.out.println(s);
        }
    }

    // Generate a detailed attendance report
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