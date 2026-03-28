// src/Student.java
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {   // new method
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {          // new method
        this.id = id;
    }

    @Override
    public String toString() {             // helpful for printing
        return "ID: " + id + ", Name: " + name;
    }
}