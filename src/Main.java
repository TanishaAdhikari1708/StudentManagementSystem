import java.util.InputMismatchException;

// Wrap the menu choice in try-catch
int choice = 0;
try {
    choice = sc.nextInt();
    sc.nextLine(); // consume newline
} catch (InputMismatchException e) {
    System.out.println("⚠ Invalid input! Please enter a number.");
    sc.nextLine(); // clear invalid input
    continue; // go back to menu
}

// Prevent duplicate IDs when adding students
case 5: // Add student
    System.out.print("Enter student ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    boolean idExists = false;
    for (Student s : students) {
        if (s.getId() == id) {
            idExists = true;
            break;
        }
    }
    if (idExists) {
        System.out.println("⚠ ID already exists. Try a different ID.");
        break;
    }
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    students.add(new Student(name, id));
    System.out.println("✅ Student added successfully.");
    break;