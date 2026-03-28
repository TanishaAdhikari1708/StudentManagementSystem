// Example changes inside while loop in Main.java

System.out.println("\n===== Student Management System =====");
System.out.println("-----------------------------------");

case 1: // Mark present
    if (students.isEmpty()) {
        System.out.println("⚠ No students in the system. Please add students first.");
        break;
    }
// ... rest of mark present code remains

case 5: // Add student
    System.out.print("Enter student ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    students.add(new Student(name, id));
    System.out.println("✅ Student added successfully.");
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
            System.out.println("✅ Student updated successfully.");
            found = true;
            break;
        }
    }
    if (!found) System.out.println("⚠ Student not found.");
    break;

case 7: // Delete student
    System.out.print("Enter student ID to delete: ");
    int deleteId = sc.nextInt();
    sc.nextLine();
    found = false;
    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getId() == deleteId) {
            students.remove(i);
            System.out.println("✅ Student deleted successfully.");
            found = true;
            break;
        }
    }
    if (!found) System.out.println("⚠ Student not found.");
    break;