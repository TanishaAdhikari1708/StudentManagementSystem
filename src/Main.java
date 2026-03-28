// src/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager attendanceManager = new AttendanceManager();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Mark student present");
            System.out.println("2. Print attendance list");
            System.out.println("3. Generate attendance report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    attendanceManager.markPresent(name);
                    break;
                case 2:
                    attendanceManager.printAttendance();
                    break;
                case 3:
                    attendanceManager.generateReport();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}