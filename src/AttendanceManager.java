// src/AttendanceManager.java
import java.util.ArrayList;

public class AttendanceManager {
    private ArrayList<String> presentStudents;

    public AttendanceManager() {
        presentStudents = new ArrayList<>();
    }

    // Mark a student as present (avoid duplicates)
    public void markPresent(String studentName) {
        if (!presentStudents.contains(studentName)) {
            presentStudents.add(studentName);
            System.out.println(studentName + " marked present.");
        } else {
            System.out.println(studentName + " is already marked present.");
        }
    }

    // Print all present students
    public void printAttendance() {
        System.out.println("Attendance List:");
        for (String name : presentStudents) {
            System.out.println(name);
        }
    }

    // Generate a simple attendance report
    public void generateReport() {
        System.out.println("Attendance Report:");
        System.out.println("Total Present: " + presentStudents.size());
        for (String name : presentStudents) {
            System.out.println("- " + name);
        }
    }
}