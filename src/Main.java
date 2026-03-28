// Add at the top of Main.java
import java.util.ArrayList;

// Inside main() before while loop
ArrayList<Student> students = new ArrayList<>();

// Update the menu inside while loop
System.out.println("5. Add student");
System.out.println("6. Update student");
System.out.println("7. Delete student");

// And inside switch-case
case 5: // Add student
    System.out.print("Enter student ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    students.add(new Student(name, id));
    System.out.println("Student added.");
    break;
case 6: // Update student
    System.out.print("Enter student ID to update: ");
    int updateId = sc.nextInt();
    sc.nextLine();
    boolean found = false;
    for (Student s : students) {
        if (s.getId() == updateId) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            s.setName(newName);
            System.out.println("Student updated.");
            found = true;
            break;
        }
    }
    if (!found) System.out.println("Student not found.");
    break;
case 7: // Delete student
    System.out.print("Enter student ID to delete: ");
    int deleteId = sc.nextInt();
    sc.nextLine();
    found = false;
    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getId() == deleteId) {
            students.remove(i);
            System.out.println("Student deleted.");
            found = true;
            break;
        }
    }
    if (!found) System.out.println("Student not found.");
    break;