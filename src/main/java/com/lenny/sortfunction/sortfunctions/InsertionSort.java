/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 * @author Phi Long
 */
public class InsertionSort {
    private String details;

    public InsertionSort(String details) {
        this.details = details;
    }

    public InsertionSort() {
    }

    public static double[] sort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /* A utility function to print array of size n*/
    public static void printArray(double[] arr) {
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nInsertion Sort\nComplexity: O(N^2) ");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
