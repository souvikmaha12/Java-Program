package Qualifier;
import java.util.*;
public class Student1 {

private int id;
    private String name;
    private int age;
    private int marks;

    public Student1(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Marks: " + marks);
    }
}

