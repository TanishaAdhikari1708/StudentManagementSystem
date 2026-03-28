case 1: // Mark student present
    if (students.isEmpty()) {
        System.out.println("No students in the system.");
        break;
    }
    System.out.println("Select student by ID to mark present:");
    for (Student s : students) {
        System.out.println(s);
    }
    System.out.print("Enter student ID: ");
    int studentId = sc.nextInt();
    sc.nextLine();
    Student selected = null;
    for (Student s : students) {
        if (s.getId() == studentId) {
            selected = s;
            break;
        }
    }
    if (selected != null) {
        attendanceManager.markPresent(selected);
    } else {
        System.out.println("Student not found.");
    }
    break;