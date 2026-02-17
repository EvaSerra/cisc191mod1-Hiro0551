package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // - Create at least 6 students and demonstrate:
        Student[]students = new Student[6];
        students[0] = new Student("Jessie",2.5,101);
        students[1] = new Student("Shrek",1.4,102);
        students[2] = new Student("James",3.7,103);
        students[3] = new Student("John GPA",4.0,104);
        students[4] = new Student("Boone",2.3,105);
        students[5] = new Student("George Washington",3.7,106);
        // - original order
        System.out.println ("Original Order:");
        System.out.println(Arrays.toString(students));

        // - sorted-by-GPA order
        System.out.println("\nSorted by GPA:");
        Student[] sortedByGPA = StudentArrayToolkit.copySortedByGpaDesc(students);
        for (Student s : sortedByGPA) {
            System.out.println(s);
        }
        
        // - topNByGpa with N=3
        System.out.println("\nTop 3 students by GPA:");
        Student[] top3byGPA = StudentArrayToolkit.topNByGpa(students, 3);
        for (Student i : top3byGPA) {
            System.out.println(i);
        }
        
        // - findByIdLinear with existing  
        Student foundExisting = StudentArrayToolkit.findByIdLinear(students, 103);
        System.out.println("\nFind ID 103:");
        System.out.println(foundExisting);

        // - non-existing id
        Student foundMissing = StudentArrayToolkit.findByIdLinear(students, 000);
        System.out.println("\nFind ID 000:");
        System.out.println(foundMissing);
    }
}