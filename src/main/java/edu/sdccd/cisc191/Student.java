package edu.sdccd.cisc191;

/**
 * Module 1 - Part B
 * Student data model with validation.
 */
public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    public Student(String name, double gpa, int id) {

        this.name = name;
        this.gpa = gpa;
        this.id = id;

        if (name == null || name.isBlank() || gpa < 0.0 || gpa > 4.0 || id <= 0)
            throw new IllegalArgumentException();
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (ID=" + id + ", GPA=" + gpa + ")";
    }
}
