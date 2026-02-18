package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Module 1 - Part C
 * Utility methods for working with Student[].
 *
 * IMPORTANT:
 * - Methods that return Student[] must return NEW arrays (defensive copy).
 * - For sorting, use a Comparator created with a lambda or method references.
 */
public class StudentArrayToolkit {

    /**
     * Returns a NEW array sorted by:
     * 1) GPA descending
     * 2) name ascending (tie-breaker)
     *
     * Must not modify the original array.
     */
    public static Student[] copySortedByGpaDesc(Student[] students) {
        Student[] newStudents = Arrays.copyOf(students, students.length);
        Comparator<Student> comparator = Comparator
            .comparingDouble(Student::getGpa).reversed() 
            .thenComparing(Student::getName); 

        Arrays.sort(newStudents, comparator);
        return newStudents;
    }


    /**
     * Linear search for a student by id.
     * Returns the Student if found, otherwise null.
     */
    public static Student findByIdLinear(Student[] students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    /**
     * Returns a NEW array containing the top N students by GPA desc (ties: name asc).
     * If n > students.length, return all students (sorted).
     * If n == 0, return an empty array.
     * @throws IllegalArgumentException if n < 0
     */
    public static Student[] topNByGpa(Student[] students, int n) {
        // validate n, sort copy, return first n in a new array
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        
        Student[] arrayCopy = Arrays.copyOf(students, students.length);
        
        Arrays.sort(arrayCopy,
            Comparator.comparing(Student::getGpa).reversed()
                .thenComparing(Student::getName)
        );
        if (n > students.length) {
            return arrayCopy;
        }
        if (n == 0) {
            return new Student[0];
        }
        Student[] topNArray = new Student[n];
        for (int i = 0; i < topNArray.length; i++) {
            topNArray[i] = arrayCopy[i];
        }
        return topNArray;
    }
}