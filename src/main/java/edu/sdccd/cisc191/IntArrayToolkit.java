package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * Module 1 - Part A
 * Utility methods for working with int[].
 *
 * IMPORTANT:
 * - Do not print inside these methods.
 * - Do not modify input array/s unless the method explicitly says so.
 */
public class IntArrayToolkit {

    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException();
        }
        int arrayTotal = 0;
        /** To iterate though arrays you can use:
         * for( int i : a) {
         *     ...
         * }
         * That way you don't have to write the whole for loop everytime
         * or do a[i] to access each item.
         */
        for (int i = 0; i< a.length; i++ ){
            arrayTotal += a[i];
        }
        return arrayTotal;
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
       if (a == null) {
            throw new IllegalArgumentException();
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
          if (a == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException();
        }

        int[] arraySorted = Arrays.copyOf(a, a.length);

        Arrays.sort(arraySorted);
        return arraySorted;
    }
}
