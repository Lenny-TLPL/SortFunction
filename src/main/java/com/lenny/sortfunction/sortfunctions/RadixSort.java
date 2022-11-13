/*
 *
 * @Author Phi Long
 */
package com.lenny.sortfunction.sortfunctions;

/**
 * @author Phi Long
 */
public class RadixSort {
    private String details;

    public RadixSort(String details) {
        this.details = details;
    }

    public RadixSort() {
    }

    static double getMax(double[] arr, int n) {
        double mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx) mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(double[] arr, int n, int exp) {
        double[] output = new double[n]; // output array
        int i;
        int[] count = new int[10];
//        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(int) ((arr[i] / exp) % 10)]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int) ((arr[i] / exp) % 10)]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of
    // size n using Radix Sort
    public static double[] radixSort(double[] arr) {
        int n = arr.length;
        // Find the maximum number to know number of digits
        double m = getMax(arr, n);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
        return arr;
    }

    // A utility function to print an array
    public static void print(double[] arr) {
        System.out.print("Array after sort: ");
        for (double j : arr) System.out.print(j + " ");
        System.out.println("\nRadix Sort\nComplexity:  O(d*(n+b)) \nWhere: \nd is the number of digits in the given list \nn is the number of elements in the list \nb is the base or bucket size used, which is normally base 10 for decimal representation");
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
